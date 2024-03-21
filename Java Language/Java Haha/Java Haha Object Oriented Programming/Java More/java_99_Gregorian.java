import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class java_99_Gregorian
{
    public static void main(String[] args)
    {
        System.out.println("---- Calendar Class ----");
        Calendar c = Calendar.getInstance();
        System.out.println("----------------------------------");
        System.out.println(c.getTime());
        System.out.println("\n---- Current Date ----");
        System.out.println("Date = " + c.get(Calendar.DATE));
        System.out.println("Time = " + c.get(Calendar.SECOND));
        System.out.println("Hour = " + c.get(Calendar.HOUR));
        System.out.println("Hour of the Day = " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("24 Timing = " + c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
        System.out.println("----------------------------------");

        System.out.println("\n---- GregorianCalendar Class ----");
        GregorianCalendar c1 = new GregorianCalendar();
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the year for that the year is leap year : ");
        int year = sc.nextInt();
        System.out.println(c1.isLeapYear(year));

        System.out.println("\n---- Time Zone Class ----");
        System.out.print("Enter the Range : ");
        int range = sc.nextInt();
        for( int i = 0 ; i<=range; i++ )
            System.out.println(TimeZone.getAvailableIDs()[i]);

    }
}
