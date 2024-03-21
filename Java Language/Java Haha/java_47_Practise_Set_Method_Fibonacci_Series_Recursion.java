import java.util.Scanner;

public class java_47_Practise_Set_Method_Fibonacci_Series_Recursion
{
    static int fibonacci( int n )
    {
                           // if( n==1 || n==2 )
                           // {
                           //     return n-1;
                            // }
        if( n == 1)
        {
            return 0;
        }
        else if( n == 2 )
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1 ) + fibonacci( n-2 );
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("fibonacci = " + fibonacci( num ));

    }
}
