import java.util.Scanner;

public class java_19_Enhanced_Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your age : ");
            int age = sc.nextInt();

            switch(age)
            {
                case 18 -> System.out.println("You became an Adult");
                case 25 -> System.out.println("You should find a jod");
                case 30 -> System.out.println("Do politics");
                default -> System.out.println("Get Lost");
            }

            System.out.println("Thanks!!!!!!!!!");
        sc.close();
    }
}
