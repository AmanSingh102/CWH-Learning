import java.util.Scanner;

public class java_30_Practise_Set_Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num,fact = 1;
        System.out.print("Enter an integer : ");
        num = sc.nextInt();

        for( int i=1; i<=num; i++ )
        {
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println("Using While loop");
        int i = 1 ;
        int fact1 = 1;
        while( i<=num )
        {
            fact1 *= i;
            i++;
        }
        System.out.println(fact1);

    }
}
