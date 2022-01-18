package Demo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class LeapYearLL {

	public static void main(String[] args) {
        LocalDate cal1
                = LocalDate.of(
                2020, 07, 18);

        LocalDate cal2
                = LocalDate.of(
                1999, 07, 18);



        List<LocalDate> calendarList = new LinkedList<>();
        calendarList.add(cal1);
        calendarList.add(cal2);

        for (LocalDate c : calendarList) {
            String formattedDate = c.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (c.isLeapYear()) {
                System.out.println(formattedDate + " is a leap year");

            } else {
                System.out.println(formattedDate + " is not a leap year");
            }
        }
    }


	}
