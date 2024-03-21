import java.util.Scanner;

public class java_6_Practise_Set_Find_CGPA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Subject : ");
        float a = sc.nextInt();
        System.out.print("Enter Second Subject : ");
        float b = sc.nextInt();
        System.out.print("Enter Third Subject : ");
        float c = sc.nextInt();

        float cgpa = ( a + b + c )/30;
        System.out.printf("CGPA IS %f",cgpa);

        sc.close();
    }
}
