import java.util.Scanner;

public class java_45_Practise_Set_Method_Pattern_Triangle
{
    static void Triangle_Pattern( int r )
    {
        for( int i=0; i<r; i++ )
        {
            for( int j=0; j<=i; j++ )
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    static void Triangle_Pattern2( int r )
    {
        for( int i=r; i>=0; i-- )
        {
            for( int j=0; j<i; j++ )
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    static void Triangle_Pattern3( int r )
    {
        if( r > 0 )                             // USING RECURSION
        {
            Triangle_Pattern3( r - 1 );
            for( int i=0; i<r; i++ )
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the range : ");
            int range = sc.nextInt();
            Triangle_Pattern(range);
            System.out.println();
            Triangle_Pattern2(range);
            System.out.println();
            Triangle_Pattern3(range);

        sc.close();
    }
}
