import java.util.Date;

public class java_97_Date_Class
{
    public static void main(String[] args)
    {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        System.out.println("\n---- Current Date and Time ----");

        Date d = new Date();
        System.out.println(d);          // Show current date and time
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
