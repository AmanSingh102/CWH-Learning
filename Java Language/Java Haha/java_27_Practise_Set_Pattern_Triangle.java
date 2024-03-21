import java.util.Scanner;

public class java_27_Practise_Set_Pattern_Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the range : ");
            int r = sc.nextInt();

            for( int i = 0; i<=r; i++ )
            {
                for( int j=0; j<=i; j++ )
                {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }

            for( int i = r; i>=0; i-- )
            {
                for( int j=0; j<=i; j++ )
                {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }

        sc.close();


    }
}
