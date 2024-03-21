import java.util.Scanner;

public class java_29_Practise_Set_Multiplication_table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int num;
            System.out.print("Enter an integer : ");
            num = sc.nextInt();

            for( int i = 1; i<=10; i++ )
            {
                System.out.printf("%d x %d = %d\n",num,i,num*i);
            }


            System.out.println("\nReverse Multiplication Table");
            int num1;
            System.out.print("Enter an integer : ");
            num1 = sc.nextInt();

            for( int i = 10; i>=1; i--)
            {
                System.out.printf("%d x %d = %d\n",num1,i,num1*i);
            }
        sc.close();


    }
}
