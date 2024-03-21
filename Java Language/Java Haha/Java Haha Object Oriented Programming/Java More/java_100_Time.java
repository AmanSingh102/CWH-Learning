import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_100_Time
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Local Date Class ----");
        LocalDate d = LocalDate.now();
        System.out.println("Local Date = " + d);

        System.out.println("\n---- Local Time Class ----");
        LocalTime t  = LocalTime.now();
        System.out.println("Local Time = " + t);

        System.out.println("\n---- Local Date - Time Class ----");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Local Date - Time = " + dt);
    }
}
