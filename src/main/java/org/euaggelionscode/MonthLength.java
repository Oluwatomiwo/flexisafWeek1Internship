package org.euaggelionscode;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class MonthLength {
    public static void main(String[] args) {


        int year = 2024;
        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int lengthOfMonth = yearMonth.lengthOfMonth();
            String monthName = yearMonth.format(DateTimeFormatter.ofPattern("MMMM"));
            System.out.println(monthName + " " + year + " has " + lengthOfMonth + " days. ");
        }
    }
}