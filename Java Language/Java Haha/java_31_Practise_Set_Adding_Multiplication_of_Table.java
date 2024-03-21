import java.util.Scanner;

public class java_31_Practise_Set_Adding_Multiplication_of_Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            int num;
            System.out.print("Enter an integer : ");
            num = sc.nextInt();
            int sum = 0;

            for( int i = 1; i<=10; i++ )
            {
                sum += num*i;
            }

            System.out.print("Sum of Multiplication table of " + num + " is ");
            System.out.println(sum);
        sc.close();

    }
}
