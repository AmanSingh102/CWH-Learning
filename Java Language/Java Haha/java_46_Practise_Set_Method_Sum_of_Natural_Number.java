import java.util.Scanner;

public class java_46_Practise_Set_Method_Sum_of_Natural_Number
{
    static int sum( int n )
    {
        // recursion
        if( n==1 )
        {
            return 1;
        }
        return n + sum( n-1 );
    }
    static int sum1( int n )
    {
        // without recursion
        int sum = 0;
        for( int i=1; i<=n; i++ )
        {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            System.out.println("Sum of Natural number is " + sum(num));
            System.out.println("Without Recursion Sum of Natural number is " + sum1(num));

        sc.close();
    }
}
