import java.util.Scanner;

public class java_28_Practise_Set_Sum_of_Even_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int range,Sum = 0;
            System.out.print("Enter the range of the even number : ");
            range = sc.nextInt();

            for( int i = 0; i<range; i++ )
            {
                Sum = Sum + (2*i);
            }

            System.out.print("Sum of even numbers is ");
            System.out.println(Sum);
        sc.close();
    }
}
