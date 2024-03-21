class MyThrMethod1 extends Thread
{
    public void run()
    {
        int i = 0;
        while( true )
        {
            System.out.println("My thread Method 1");
            try
            {
                Thread.sleep(45555);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyThrMethod2 extends Thread
{
    public void run()
    {
        int i = 0;
        while( true )
        {
            System.out.println("My thread Method 2");
        }
    }
}

public class java_80_Thread_Methods
{
    public static void main(String[] args)
    {
        MyThrMethod1 t1 = new MyThrMethod1();
        MyThrMethod2 t2 = new MyThrMethod2();

        t1.start();

        // ---- Join Method ----
//        try
//        {
//            t1.join();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }



        t2.start();

    }
}
