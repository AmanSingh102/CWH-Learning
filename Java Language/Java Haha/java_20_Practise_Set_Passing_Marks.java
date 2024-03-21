import java.util.Scanner;

public class java_20_Practise_Set_Passing_Marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        byte n1,n2,n3;
        System.out.print("Enter your CC - 01 marks : ");
        n1 = sc.nextByte();
        System.out.print("Enter your CC - 02 marks : ");
        n2 = sc.nextByte();
        System.out.print("Enter your CC - 03 marks : ");
        n3 = sc.nextByte();

        float avg = ( n1 + n2 + n3 )/3.0F;
        System.out.println("Your overall percentage is " + avg );

        if( avg >= 40 && n1>=33 && n2>=33 && n3>=33)
            System.out.println("Your are Pass !!!");
        else
            System.out.println("You are Fail !!!");

    }
}
