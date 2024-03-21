import java.util.Scanner;

public class java_16_Practise_Set_Detect_doubleAnd_triple_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Write Something Here : ");
            String myString = sc.nextLine();

            System.out.println(myString.indexOf("  "));
            System.out.println(myString.indexOf("   "));

        sc.close();

    }
}
