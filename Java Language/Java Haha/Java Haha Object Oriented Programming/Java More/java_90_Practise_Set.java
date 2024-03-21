import java.util.Scanner;

class MaxRetiresException extends Exception
{
    @Override
    public String getMessage() {
        return "MAx inputs reached";
    }
}

public class java_90_Practise_Set
{
    public static void reached( int r ) throws MaxRetiresException
    {
        if( r < 5 ) { throw new MaxRetiresException(); }

    }

    public static void main(String[] args) throws MaxRetiresException {
        System.out.println("\n----------------- PROBLEM 1 ----------------");
        System.out.println("int a = 7    <------  [ SYNTAX ERROR ]");

        System.out.println();
        System.out.println("int age = 78;\nint year_born = 2000 - 78;   <-----------  [ LOGICAL ERROR ]");

        System.out.println();
        System.out.println("System.out.println(9/0);   <----------- [ EXCEPTION ]");



        System.out.println("\n----------------- PROBLEM 2 ----------------");
        Scanner sc  = new Scanner(System.in);
        try
        {
            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            int divide = num1/num2;
            System.out.println(divide);
        }
        catch( IllegalArgumentException e)
        {
            System.out.println("Hehe");
        }
        catch( ArithmeticException e )
        {
            System.out.println("Haha");
        }



        System.out.println("\n----------------- PROBLEM 3 ----------------");
        boolean flag = true;
        int index;
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 12;
        marks[2] = 45;

        int i = 0;
        while(flag && i < 5)
        {
            try
            {
                System.out.print("Enter the Index value : ");
                index = sc.nextInt();
                System.out.println("The marks of Index " + index + " is " + marks[index]);
                break;
            }
            catch( Exception e )
            {
                System.out.println("INVALID INPUT !!!");
                i++;
            }

            if( i >= 5 )
            {
                System.out.println("ERROR");

            }

        }



        System.out.println("\n----------------- PROBLEM 4 ----------------");
        boolean flag1= true;
        int index1;
        int [] marks1 = new int[5];
        marks1[0] = 7;
        marks1[1] = 12;
        marks1[2] = 45;

        int i1 = 0;
        while(flag1 && i1 < 5)
        {
            try {
                System.out.print("Enter the Index value : ");
                index1 = sc.nextInt();
                System.out.println("The marks of Index " + index1 + " is " + marks[index1]);
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT !!!");
                i1++;
            }

            if (i1 >= 5) {
                try {
                    throw new MaxRetiresException();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }



            System.out.println("\n----------------- PROBLEM 5 ----------------");
            boolean flag2= true;
            int index2;
            int [] marks2 = new int[5];
            marks2[0] = 7;
            marks2[1] = 12;
            marks2[2] = 45;

            int i2 = 0;
            while(flag2 && i2 < 5)
            {
                try
                {
                    System.out.print("Enter the Index value : ");
                    index2 = sc.nextInt();
                    System.out.println("The marks of Index " + index2 + " is " + marks[index2]);
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("INVALID INPUT !!!");
                    i2++;
                }

                reached(i2);
            }
    }
}
