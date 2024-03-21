import java.util.Scanner;

public class java_86_Nested_Try_And_Catch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Understanding of Nested try and catch");

        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        boolean flag = true;
        while(flag)
        {
            try
            {
                System.out.print("\nEnter the index value : ");
                int index = sc.nextInt();

                try
                {
                    System.out.println(marks[index]);
                    flag = false;
                }
                catch( ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch( Exception e )
            {
                System.out.println("Exception in level 1");
            }
        }

        System.out.println("Thanks for Using This Program");

    }
}
