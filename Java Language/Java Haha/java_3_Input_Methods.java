import java.util.Scanner;

public class java_3_Input_Methods
{
    public static void main(String[] args)
    {
        System.out.print("Input Methods ----------------- \n");
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Sentence : ");
            String sentence = sc.nextLine();
            System.out.println(sentence);

            System.out.print("Enter an integer : ");
            int num = sc.nextInt();
            System.out.println(num);

            System.out.print("Enter a word : ");
            String word = sc.next();
            System.out.println(word);

            System.out.print("Enter the number : ");
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);

        sc.close();

    }
}
