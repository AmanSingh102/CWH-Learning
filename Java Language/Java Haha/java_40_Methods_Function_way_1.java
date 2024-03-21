import java.util.Scanner;

public class java_40_Methods_Function_way_1
{
    static  int sum(int x,int y)
    {
        return x + y;
    }

    static  int numNotChange( int x, int y )
    {
        x = 200 ; y = 300;
        return x + y ;
    }

    int subtract( int x,int y )
    {
        return  x - y;
    }

    static void string()
    {
        System.out.println("This is a void return type");
    }

    static  void ChangeArr( int [] arr )
    {
        arr[0] = 130012;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            int num1,num2;
            System.out.print("Enter first number : ");
            num1 = sc.nextInt();
            System.out.print("Enter Second number : ");
            num2 = sc.nextInt();

            int sum =  sum(num1,num2);
            System.out.print("\nSum of " + num1 + " and " + num2 + " is " + sum) ;
            System.out.printf("\nnum1 = %d , num2 = %d",num1,num2);

            System.out.printf("\nSum = %d",numNotChange(num1,num2));

            System.out.print("\n\n---- USING OBJECT METHOD FOR SUBTRACTION ----");
            java_40_Methods_Function_way_1 object = new java_40_Methods_Function_way_1();
            int subtract = object.subtract(num1,num2);
            System.out.print("\nDifference of " + num1 + " and " + num2 + " is " + subtract + "\n");
            System.out.printf("num1 = %d , num2 = %d\n",num1,num2);

            System.out.println();
            string();

            System.out.println("\n---- Changing the Array Element ----");
            int [] array = { 12,65,44,77,55,22 };
            ChangeArr(array);
            System.out.print("First element is " + array[0] );

        sc.close();

    }
}
