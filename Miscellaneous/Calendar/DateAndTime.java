package Miscellaneous.Calendar;

import java.util.*;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant
 * in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for
 * manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. You just need to write the method, getDay, which returns the day on that date.
 * To simplify your task, we have provided a portion of the code in the editor.
 * <p>
 * Further details are provided in the info.pdf file provided within this directory.
 */
class Result {
    public static String findDay(int month, int day, int year) {
        Calendar time = new GregorianCalendar();
        time.set(year, month - 1, day);
        int dayOfWeek = time.get(Calendar.DAY_OF_WEEK);

        return switch (dayOfWeek) {
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            case 7 -> "SATURDAY";
            default -> null;
        };
    }
}

public class DateAndTime {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);

        String[] firstMultipleInput = buffer.nextLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println("Entered: " + month + "/" + day + "/" + year);
        System.out.println(res);

        buffer.close();
    }
}
