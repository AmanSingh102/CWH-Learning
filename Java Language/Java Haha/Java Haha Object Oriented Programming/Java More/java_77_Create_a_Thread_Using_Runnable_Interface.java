class MyThreadRunnable1 implements Runnable
{
    @Override
    public void run()
    {
        int i = 0;
        while( i < 10 )
        {
            System.out.println("I am Thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable
{
    @Override
    public void run()
    {
        int i = 0;
        while( i < 10 )
        {
            System.out.println("I am Thread 2");
            i++;
        }
    }
}

public class java_77_Create_a_Thread_Using_Runnable_Interface
{
    public static void main(String[] args)
    {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread Gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread Gun2 = new Thread(bullet2);

        Gun1.start();
        Gun2.start();

    }
}
