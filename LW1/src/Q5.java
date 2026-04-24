import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Q5 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("E,MMMM dd,yyyy");
        System.out.println(today.format(format));
    }
}
