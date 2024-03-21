import java.util.Scanner;

public class java_38_Practise_Set_Reverse_the_Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of an array : ");
            int size = sc.nextInt();
            int[] array = new int[size];

            for( int i=0; i<array.length; i++ )
            {
                    System.out.printf("Enter %d element : ", i + 1);
                    array[i] = sc.nextInt();
            }

            int l = array.length;
            int n = Math.floorDiv(l,2) ;
            int temp;

            for( int i=0; i<n; i++ )
            {
                temp = array[i];
                array[i] = array[ l - i - 1 ];
                array[ l - i -1 ] = temp;
            }

            System.out.print("\n---- Reverse of an Array ----\n");
            for( int element : array )
            {
                System.out.print( element + " " );
            }

            System.out.print("\n---- Maximum Number ----\n");
            int max = Integer.MIN_VALUE;                               // you can use max = 0;
            for( int e : array )
            {
                if( e > max )
                {
                    max = e;
                }
            }
            System.out.print("Maximum number of an Array : " + max );

            System.out.print("\n---- Minimum Number ----\n");
            int min = Integer.MAX_VALUE;
            for( int e : array )
            {
                if( e < min )
                {
                    min = e;
                }
            }

            System.out.print("Minimum number of an Array : " + min );
            System.out.println("\n---- END ALL PROCESS ----");

        sc.close();
    }
}
