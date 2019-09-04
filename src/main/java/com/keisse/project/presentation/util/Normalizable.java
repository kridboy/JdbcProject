package com.keisse.project.util;

public interface Normalizable<T> {
   void newEntryToDB();
   T getObjectFromDB();
}
