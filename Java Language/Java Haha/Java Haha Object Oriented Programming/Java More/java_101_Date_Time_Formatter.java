import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_101_Date_Time_Formatter
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Local Date Time Formatter Class ----");
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        System.out.println("\n---- Date Time Formatter Class ----");
        DateTimeFormatter df  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String MyDate = dt.format(df);
        System.out.println(MyDate);

        DateTimeFormatter df0  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String MyDate0 = dt.format(df0);
        System.out.println(MyDate0);

        DateTimeFormatter df00  = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E");
        String MyDate00 = dt.format(df00);
        System.out.println(MyDate00);

        DateTimeFormatter df01  = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a");
        String MyDate01 = dt.format(df01);
        System.out.println(MyDate01);

        DateTimeFormatter df02  = DateTimeFormatter.ofPattern("H:m a dd-MM-yyyy E");
        String MyDate02 = dt.format(df02);
        System.out.println(MyDate02);

        DateTimeFormatter df03  = DateTimeFormatter.ofPattern("H:m a || dd-MM-yyyy || E");
        String MyDate03 = dt.format(df03);
        System.out.println(MyDate03);

        System.out.println("\n-------------- Another Patter ---------------");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String MyDate2 = dt.format(df2);
        System.out.println(MyDate2);
    }
}
