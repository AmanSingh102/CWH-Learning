import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class myDeprecated
{
    @Deprecated
    void meth1()
    {
        System.out.println("I am meth 1");
    }
}

interface  MyInt
{
    void Display();
}

public class java_110_Practise_Set
{
    @SuppressWarnings( "deprecation ")
    public static void main(String[] args)
    {
        myDeprecated d = new myDeprecated();
        d.meth1();

        // problem 4
        MyInt i = () -> System.out.println("I am Display");

        // problem 5
        System.out.println("Write Multiplication table on the File ");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int i1 = sc.nextInt();
        String table = "";
        for( int j = 0; j<10; j++ )
        {
            table += i1 + " X " + (j+1) + " = " + i1*(j+1);
            table += "\n";
        }
        try
        {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
