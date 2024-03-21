public class java_84_Try_Catch_Block
{
    public static void main(String[] args)
    {
        int a = 1000;
        int b = 0;

        try
        {
            int c = a/b;
            System.out.println("Yhe result is " + c);
        }
        catch( Exception e )
        {
                System.out.println("We failed to divide, Reason !!! ");
                System.out.println(e);
        }

            System.out.println("The End of the Program....");
    }
}
