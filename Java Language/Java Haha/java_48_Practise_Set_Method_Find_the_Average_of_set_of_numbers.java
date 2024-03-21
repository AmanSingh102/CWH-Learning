public class java_48_Practise_Set_Method_Find_the_Average_of_set_of_numbers
{
    static int sum1( int a,int ...arr)
    {
        // ...arr behaves as int [] arr
        int result = a;
        for( int element : arr )
        {
            result += element;
        }
        return result;
    }

    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Size of an array : ");
//        int size = sc.nextInt();
//        int [] array = new int[size];
//
//        for( int i=0; i<array.length; i++ )
//        {
//            System.out.printf("Enter %d element : ", i + 1);
//            array[i] = sc.nextInt();
//        }

        System.out.print("Average = " + sum1(1,5,4,7,8,5,2,5)/2);
    }
}
