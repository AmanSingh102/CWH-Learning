import java.util.Scanner;

public class java_14_Practise_Set_Replace_with_Underscore
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the text : ");
            String text = sc.nextLine();
            text = text.replace(" ","_");
            System.out.println(text);

        sc.close();
    }
}
