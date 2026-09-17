//Explore Methods of Local Date Class 

package assignment;

import java.time.LocalDate;

class Q3Test {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println("Current Date = " + date);

        System.out.println("Year = " + date.getYear());

        System.out.println("Month = " + date.getMonth());

        System.out.println("Month Value = " + date.getMonthValue());

        System.out.println("Day = " + date.getDayOfMonth());

        System.out.println("Day of Week = " + date.getDayOfWeek());

        System.out.println("Day of Year = " + date.getDayOfYear());

        System.out.println("Length of Month = " + date.lengthOfMonth());

        System.out.println("Length of Year = " + date.lengthOfYear());

        System.out.println("Leap Year = " + date.isLeapYear());

        System.out.println("Tomorrow = " + date.plusDays(1));

        System.out.println("Yesterday = " + date.minusDays(1));

        System.out.println("Next Month = " + date.plusMonths(1));

        System.out.println("Previous Month = " + date.minusMonths(1));

        System.out.println("Next Year = " + date.plusYears(1));

        System.out.println("Previous Year = " + date.minusYears(1));

        LocalDate customDate = LocalDate.of(2025, 8, 15);

        System.out.println("Custom Date = " + customDate);

        System.out.println("Is Before = " + customDate.isBefore(date));

        System.out.println("Is After = " + customDate.isAfter(date));

        System.out.println("Is Equal = " + customDate.isEqual(date));
    }
}
