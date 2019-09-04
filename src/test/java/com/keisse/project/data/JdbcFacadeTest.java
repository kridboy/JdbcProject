package com.keisse.project.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class JdbcFacadeTest {
    //TODO use mockito for checking classes!
    final static String QUERY1 = "INSERT INTO Breeders(BreederName,Contact,PhoneNumber) VALUES('CoolCat','Jafar','0420696969')";
    final static String QUERY2 = "UPDATE Breeders SET BreederName='Cool' WHERE BreederName='CoolCat'";
    final JdbcFacade facadeTest = JdbcFacade.getInstance();

    @Test
    void executeStatement() {
        assertDoesNotThrow(() -> JdbcFacade.executeStatement(QUERY1));
    }

    @Test
    void updateStatement() {
        assertDoesNotThrow(() -> JdbcFacade.updateStatement(QUERY2));
    }

    @Test
    void close() {
        assertDoesNotThrow(facadeTest::close);
    }
}