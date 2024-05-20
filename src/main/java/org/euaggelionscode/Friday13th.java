package org.euaggelionscode;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Friday13th {
    public static void main(String[] args) {

        int year = 2024;
        int month = 5;
        int day = 13;

        LocalDate dateToTest = LocalDate.of(year, month, day);
        boolean isFridayThe13th = isFridayThe13th(dateToTest);

        if (isFridayThe13th) {
            System.out.println(dateToTest + " falls on Friday the 13th.");
        } else {
            System.out.println(dateToTest + " does not fall on Friday the 13th.");
        }
}
    public static boolean isFridayThe13th(LocalDate date) {
        return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
    }
}