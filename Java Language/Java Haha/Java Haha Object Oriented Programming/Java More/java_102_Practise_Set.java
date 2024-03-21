import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class java_102_Practise_Set
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("\n---- Solution 1 ----");
        ArrayList arr = new ArrayList();
        arr.add("Aman");
        arr.add("Nman");
        arr.add("Saman");
        arr.add("Kaman");
        arr.add("Raman");
        for(Object o: arr)
        {
            System.out.println(o);
        }

        System.out.println("\n---- Solution 2 ----");
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        System.out.println("\n---- Solution 3 ----");
        Calendar c  = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println("\n---- Solution 4 ----");
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df  = DateTimeFormatter.ofPattern("H:m:s");
        String MyTime = dt.format(df);
        System.out.println(MyTime);

        System.out.println("\n---- Solution 5 ----");
        HashSet<Integer> s = new HashSet<>();
        s.add(0);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(6);
        System.out.println("Duplicate Element Print nhi kiya " + s);

    }
}
