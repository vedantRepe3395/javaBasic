import java.time.*;
import java.time.format.DateTimeFormatter;

public class dataAndTime {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();  // current date
        System.out.println(a);
        LocalTime b = LocalTime.now(); // current time
        System.out.println(b);
        LocalDateTime c = LocalDateTime.now(); // current date and time
        System.out.println(c);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"); // this class used for formatting of date
        String e = c.format(d); // convert date and time into formatted pattern
        System.out.println(e);

    }
}
