import java.util.Random;
import java.util.Scanner;

public class java_25_Practise_Set_Rock_Paper_Game
{
    static void InputComputer( int n )
    {
        if( n == 0 )
        {
            System.out.println("Computer choice :- Rock");
        }
        else if( n == 1 )
        {
            System.out.println("Computer choice :- Paper");
        }
        else if( n == 2 )
        {
            System.out.println("Computer choice :- Scissor");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor : ");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3 );

            if( userInput == computerInput )
            {
                System.out.println("---- Draw ----");
            }
            else if( userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1 )
            {
                System.out.println("---- You Wins ----");
            }
            else
            {
                System.out.println("---- Computer Wins ----");
            }

             //System.out.println("Computer Choice :- " + computerInput );
            InputComputer(computerInput);

        sc.close();

    }
}

