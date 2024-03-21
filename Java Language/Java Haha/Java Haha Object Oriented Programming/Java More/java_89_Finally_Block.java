public class java_89_Finally_Block {
    public static int greet()
    {
        try
        {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("--------------------------------------------------");
            System.out.println("Cleaning up resources........ This is the End of the Function");
        }

        return -1;

    }


    public static void main(String[] args)
    {
//        try
//        {
//            int a = 5;
//            int b = 0;
//            int c = a/b;
//        }
//        catch( Exception e )
//        {
//            System.out.println(e);
//        }
//        finally
//        {
//            System.out.println("This is the End of the Program");
//        }
//
//    }

        //greet();
        int k = greet();
        System.out.println(k);


        int a = 7;
        int b = 9;
        while(true)
        {
            try
            {
                System.out.println(a/b);
            }
            catch( Exception e )
            {
                System.out.println(e);
                break;
            }
            finally
            {
                System.out.println("--------------------------------------");
                System.out.println("I Am Finally for value b is " + b);
            }

            b--;
        }




        System.out.println("--------------------------------------");

        try
        {
            System.out.println(50/10);
        }
        finally
        {
            System.out.println("Tab v chalega");
        }

        System.out.println("--------------------------------------");

        try
        {
            System.out.println(5/0);
        }
        finally
        {
            System.out.println("Try nhi chalega to finally chalega");
        }


    }
}
