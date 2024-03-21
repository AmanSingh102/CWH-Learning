import java.util.Scanner;

public class java_23_Practise_Set_Find_Website
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your website name : ");
            String Website = sc.nextLine();

            if( Website.endsWith(".org") )
                System.out.println("This is an Organizational Website");
            else if( Website.endsWith(".com") )
                System.out.println("This is a Commercial Website");
            else if( Website.endsWith(".in") )
                System.out.println("This is a Indian Website");

        sc.close();
    }
}
