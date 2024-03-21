import java.util.Calendar;
import java.util.TimeZone;


public class java_98_Calender_Class
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        System.out.println("\n---------------------------------");

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.getTime());


    }
}
