import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number;
    public int inputNumber;
    public int getNoOfGuesses = 0;

    public int getGetNoOfGuesses()
    {
        return getNoOfGuesses;
    }
    public void setGetNoOfGuesses(int getNoOfGuesses)
    {
        this.getNoOfGuesses = getNoOfGuesses;
    }
    Game()
    {
        Random random = new Random();
        this.number = random.nextInt(100);;
    }

    void takeUserInput()
    {
        System.out.print("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(  )
    {
        getNoOfGuesses++;
        if( inputNumber == number)
        {
            System.out.printf("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number,getNoOfGuesses   );
            return true;
        }
        else if( inputNumber < number )
        {
            System.out.println("Too Low......");
        }
        else if( inputNumber > number ) {
            System.out.println("Too High......");
        }
        return false;
    }
}

public class java_54_Guess_number_game
{
    public static void main(String[] args)
    {
        Game g = new Game();

        boolean b = false;
        while( !b )
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
