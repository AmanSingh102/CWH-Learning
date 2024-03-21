import java.util.Scanner;

class NegativeRadiusException extends Exception        // custom Exception
{
    @Override
    public String toString() {
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative";
    }
}

public class java_88_Throws_And_Throw
{
    public static double area( int r ) throws NegativeRadiusException
    {
        if( r < 0 ) { throw new  NegativeRadiusException(); }

        double result = Math.PI * r * r;
        return result;
    }

    public static int divide( int a, int b ) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int result = divide(num1,num2);
            System.out.println(result);
        }
        catch( Exception e )
        {
            System.out.println("Exception");
            System.out.println(e + " [ Exception ]");
        }

        try
        {
            System.out.print("Enter radius : ");
            int radius = sc.nextInt();

            double result = area(radius);
            System.out.println(result);
        }
        catch( Exception e )
        {
            System.out.println("Exception");
            System.out.println(e + " [ Exception ]");
        }

    }
}
