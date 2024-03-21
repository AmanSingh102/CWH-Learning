import java.util.Scanner;

public class java_11_String
{
    public static void main(String[] args)
    {
        String name = new String("Aman");
        String name1 = "Aman Singh";              // Another way
        System.out.println(name);                 // way of print
        System.out.print(name1);                  // way of print
        int i = 1;
        System.out.printf("\n%d Aman",i);         // way of print
        System.out.format("\n%d is Aman",i);      // way of print

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a sentence : ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
        
        System.out.print("Enter one word : ");
        String word = sc.next();
        System.out.println(word);

    }
}
