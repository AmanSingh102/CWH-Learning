import java.util.Scanner;

public class java_35_Practise_Set_Given_integer_Present_or_not
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            float[] array = { 52.2f,64.3f,65.4f,96.2f,96.8f };
            float num;

            System.out.print("Enter number to be find : ");
            num = sc.nextFloat();

            boolean isINArray = false;

            for(float element : array )
            {
                if( num == element )
                {
                    isINArray = true;
                    break;
                }

            }

            if( isINArray )
            {
                System.out.println("The value is present in array");
            }
            else
            {
                System.out.println("The value is not present in array");
            }

        sc.nextFloat();


    }
}
