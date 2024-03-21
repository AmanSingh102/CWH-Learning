import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage";
    }
}

class MaxAgeException extends Exception
{
    @Override
    public String toString()
    {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage()
    {
        return "make sure that the value of age entered is correct ";
    }
}

public class java_87_Exception_Class
{
    public static void main(String[] args)
    {
        int a ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        a = sc.nextInt();

        if(a < 9)
        {
            try
            {
                //throw new MyException();
                throw new MaxAgeException();
                //throw new ArithmeticException("This is an Exception");
            }
            catch( Exception e )
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("yes Finished");
        }

    }
}
