import java.util.Scanner;

public class java_39_Practise_Set_Check_An_Array_Sorted_or_Not
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

            boolean isSorted = true;
            for( int i = 0; i<array.length - 1 ; i++ )
            {
                if( array[i] > array[ i + 1 ] )
                {
                    isSorted = false;
                    break;
                }
            }

            if( isSorted )
            {
                System.out.println("The array is sorted");
            }
            else
            {
                System.out.println("The array is not sorted");
            }

        sc.close();
    }
}
