import java.util.Scanner;

public class java_83_Errors_And_Exception
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number : ");
            int num  = sc.nextInt();

            System.out.println("---- Logical Error ---- ");
            System.out.print("Prime Numbers are : ");
            for( int i = 1; i<=num; i++ )
            {
                System.out.print(2*i+1 + " ");
            }


            System.out.println("\n");
            System.out.println("---- Runtime Error ---- ");
            System.out.print("Enter the number : ");
            int k = sc.nextInt();
            System.out.println("1000 divided by K is " + 1000/k);

        sc.close();

    }
}
