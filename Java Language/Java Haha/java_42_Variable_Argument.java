public class java_42_Variable_Argument
{
    static int sum( int ...arr)
    {
        // ...arr behaves as int [] arr
        int result = 0;
        for( int element : arr )
        {
            result += element;
        }
        return result;
    }
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
        System.out.println("The sum is " + sum());
        System.out.println("The sum of 2 and 3 is " + sum(2,3));
        System.out.println("The sum of 2 and 3 and 4 is " + sum(2,3,4));
        System.out.println("The sum is " + sum(2,3,4,5,6,7,8,9));

        System.out.println();
        System.out.println("The sum is " + sum1(1));
        System.out.println("The sum of 2 and 3 is " + sum1(2,3));
        System.out.println("The sum of 2 and 3 and 4 is " + sum1(2,3,4));
        System.out.println("The sum is " + sum1(2,3,4,5,6,7,8,9));
    }
}
