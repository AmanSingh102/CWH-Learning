//import java.util.Scanner;         // scanner file is in util
//import java.util.*;                // its import all the file of the util package  * means all the file of the util package

public class java_68_Types_Of_Using_Packages
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int a = sc.nextInt();
//        System.out.println("The entered number is " + a);
//        sc.close();

        java.util.Scanner uc = new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int b = uc.nextInt();
        System.out.println("The entered number is " + b);
        uc.close();

    }
}
