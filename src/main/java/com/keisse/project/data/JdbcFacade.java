package com.keisse.project.data;

import java.io.Closeable;
import java.sql.*;

//TODO implement this in a try with resources!
public class JdbcFacade implements Closeable, AutoCloseable {
    private static Connection con;
    private static Statement stmt;
    private static PreparedStatement pstmt;
    private static JdbcFacade instance = new JdbcFacade(); //eargerly initiating

    private JdbcFacade() {
        con = getConnection();
        //instance = getInstance();
    }

    public static JdbcFacade getInstance() {
        if (instance == null) return new JdbcFacade();
        return instance;

    }

    private static Connection getConnection() {
        if (con != null) return con;

        try {
            con = DriverManager.getConnection(
                    "jdbc:mariadb://noelvaes.eu/javaeewondelgemDB12",
                    "javaeewondelgem",
                    "java€€wond€lg€m2019"
            );
            return con;

        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }

    public static void executeStatement(String sql) {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void updateStatement(String sql) {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ResultSet selectStatement(String table, String column, String condition) {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return stmt.executeQuery("SELECT * FROM " + table + " WHERE " + column + "='" + condition + "'");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static ResultSet selectStatement(String sql) {
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return stmt.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void executePreparedStatement() {
        //TODO
    }

    public static void addToPreparedStatement() {
        //TODO
    }

    private static void closeConnection() {
        try {
            con.close();
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }

    public void close() {
        closeConnection();
    }

}
