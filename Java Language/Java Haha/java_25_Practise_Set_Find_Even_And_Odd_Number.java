import java.util.Scanner;

public class java_25_Practise_Set_Find_Even_And_Odd_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n---- Even Numbers ---- ");
            System.out.print("Enter the Range of the even number : ");
            int range = sc.nextInt();

            for( int i=0; i<=range; i++ )
            {
                System.out.print(2*i);
                System.out.print("\t");
            }

            System.out.println("\n---- Odd Numbers ---- ");
            System.out.print("Enter the Range of the odd number : ");
            int range1 = sc.nextInt();

            for( int i=0; i<=range1; i++ )
            {
                System.out.print( 2*i + 1 );
                System.out.print("\t");
            }

            System.out.println("\n---- Natural number is reverse order ---- ");
            System.out.print("Enter the number : ");
            int range2 = sc.nextInt();

            for( int i=range2; i!=0; i-- )
            {
                System.out.print(i);
                System.out.print("\t");
            }

        sc.close();
    }
}
