import java.util.Scanner;

public class java_13_Practise_Set_Convert_to_LowerCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            name = name.toLowerCase();
            System.out.println(name);

        sc.close();
    }
}
