package javaBasicPrograms;

import java.time.LocalDate;

public class DayUsingDate {
    public static void main(String[] args) {
        dayOnTheGivenDate(2022, 05, 03);
    }

    private static void dayOnTheGivenDate(Integer year, Integer month, Integer day) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);

        LocalDate ld = LocalDate.of(y, m, d);
        System.out.println(ld.getDayOfWeek().toString());

    }
}
