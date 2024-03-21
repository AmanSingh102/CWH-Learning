import java.util.Scanner;

public class java_85_Handling_Specific_Exception
{
    public static void main(String[] args)
    {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index : ");
        int index = sc.nextInt();
        System.out.print("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();

        try
        {
            System.out.println("The value at array index entered is : " + marks[index]);
            System.out.println("The value of array-value/number is : " + marks[index]/number);
        }
        catch( ArithmeticException e)
        {
            System.out.println("Some Exception occur ");
            System.out.println(e);
        }
        catch( ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occur ");
            System.out.println(e);
        }
        catch( Exception e)
        {
            System.out.println("Some other exception occur ");
            System.out.println(e);
        }

        sc.close();
    }
}
