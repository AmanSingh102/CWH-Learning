import java.util.Scanner;

public class java_5_Practise_Set_Add_Three_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int b = sc.nextInt();
            System.out.print("Enter Third Number : ");
            int c = sc.nextInt();

            int Sum = a + b + c ;
            System.out.printf("Sum of %d,%d,%d is %d",a,b,c,Sum);

        sc.close();
    }
}
