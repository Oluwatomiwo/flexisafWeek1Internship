package org.euaggelionscode;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MondayLister {
    public static void main(String[] args) {

        Month month = Month.MAY;

        int currentYear = LocalDate.now().getYear();

        LocalDate firstDayOfMonth = LocalDate.of(currentYear, month, 1);

        LocalDate firstMonday = firstDayOfMonth.with(DayOfWeek.MONDAY);

        List<LocalDate> mondays = new ArrayList<>();

        mondays.add(firstMonday);


        LocalDate nextMonday = firstMonday;
        while ((nextMonday = nextMonday.plusWeeks(1)).getMonth() == month) {
            mondays.add(nextMonday);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d , yyyy");
        System.out.println("Mondays in " + month + " " + currentYear + ":");
        for (LocalDate monday : mondays) {
            System.out.println(formatter.format(monday));
        }
    }
}
