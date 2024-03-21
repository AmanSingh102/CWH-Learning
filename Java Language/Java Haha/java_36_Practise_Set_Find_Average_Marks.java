import java.util.Scanner;

public class java_36_Practise_Set_Find_Average_Marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float [] marks = new float[5];                                        //{ 52.2f,64.3f,65.4f,96.2f,96.8f };
        float sum = 0;

        for(int i=0; i< marks.length; i++ )
        {
            System.out.printf("Enter %d Subject : ",i+1);
            marks[i] = sc.nextFloat();
        }

        for( float element : marks )
        {
            sum = sum + element;
        }
        System.out.println("The sum is " + sum/ marks.length);

        sc.nextFloat();

    }
}
