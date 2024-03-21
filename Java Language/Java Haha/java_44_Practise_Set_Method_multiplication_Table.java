import java.util.Scanner;

public class java_44_Practise_Set_Method_multiplication_Table
{
    static void multiplication_table( int n )
    {
        for( int i=1; i<=10; i++ )
        {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        multiplication_table(num);
    }
}
