class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while( i < 10 )
        {
            System.out.println("My Cooking Thread is running");
            System.out.println("I am Sad");
            i++;
        }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while( i < 10 )
        {
            System.out.println("My Chatting Thread2 is running");
            System.out.println("I am super sad");
            i++;
        }
    }
}

public class java_76_Create_a_Thread_By_Extending_Thread_Class
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}
