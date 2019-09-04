package com.keisse.project.presentation.util;

public interface Normalizable<T> {
   void newEntryToDB();
   T getObjectFromDB();
}
