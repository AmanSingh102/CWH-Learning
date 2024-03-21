import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class java_109_File_Handling
{
    public static void main(String[] args)
    {

        System.out.println("Code for Creating a new file\n");
        /*
        File myfile = new File("Aman.txt");

        try
        {
            myfile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }
        */

        System.out.println("Code for Writing to the File\n");
        /*
        try
        {
            FileWriter fileWriter = new FileWriter("Aman.txt");
            fileWriter.write("This is my First File");
            fileWriter.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        */

        System.out.println("Reading from the File");
        /*
        File myFile = new File("Aman.txt");
        try
        {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        */

        System.out.println("Deleting the File");
        File myFile = new File("Aman.txt");
        if(myFile.delete())
        {
            System.out.println("I have deleted :- " + myFile.getName());
        }
        else
        {
            System.out.println("Some problem occured while deleting the file");
        }




    }
}
