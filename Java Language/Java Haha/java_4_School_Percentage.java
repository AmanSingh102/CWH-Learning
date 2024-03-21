import java.util.Scanner;

public class java_4_School_Percentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your cc - 01 marks : ");
            float cc1 = sc.nextInt();

            System.out.print("Enter your cc - 02 marks : ");
            float cc2 = sc.nextInt();

            System.out.print("Enter your math marks : ");
            float math = sc.nextInt();

            System.out.print("Enter your Hindi marks : ");
            float hindi = sc.nextInt();

            System.out.print("Enter your English marks : ");
            float english = sc.nextInt();

            float marks = cc1 + cc2 + math + hindi + english ;
            float percentage = marks / 5;

            System.out.printf("Percentage is %f",percentage);

        sc.close();

    }
}
