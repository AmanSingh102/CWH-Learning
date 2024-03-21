import java.util.Scanner;

public class java_43_Recursion_Factorial
{
    static int factorial( int n )
    {
        // recursive approach
        if( n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative_method( int n )
    {
        // recursive approach
        if( n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for( int i = 1; i <= n; i++ )
            {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            System.out.println("The Factorial of " + num + " is " + factorial(num));
            System.out.println("The Factorial Iterative Method of " + num + " is " + factorial_iterative_method(num));

        sc.close();
    }
}
