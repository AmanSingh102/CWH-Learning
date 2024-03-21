import java.util.Scanner;

public class java_8_Practise_Set_Kilometer_to_Miles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Distance in kilometer : ");
            float kilo = sc.nextInt();

            float miles  = ( kilo * 0.621371F );
            System.out.printf("%f Kilometer = %f Miles",kilo,miles);

        sc.close();
        // last question is checking the number given by user is integer or not ?  kar chukka hai tum
        
    }
}
