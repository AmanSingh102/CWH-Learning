class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println("Under the MyThr");
    }

    public MyThr(MyThreadRunnable3 tr, String name)
    {
        super(name);
    }

}

class MyThreadRunnable3 implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Under the MyThreadRunnable");
    }
}


public class java_78_Thread_Constructor
{
    public static void main(String[] args)
    {
        MyThr t = new MyThr("Aman");
        t.start();
        System.out.println("the id of the thread t is : " + t.getId());
        System.out.println("the name of the thread t is : " + t.getName());

        System.out.println();
        MyThr t2 = new MyThr("Saman");
        t2.start();
        System.out.println("the id of the thread t2 is : " + t2.getId());
        System.out.println("the name of the thread t2 is : " + t2.getName());

        System.out.println();
        MyThreadRunnable3 tr = new MyThreadRunnable3();
        MyThr t3 = new MyThr(tr,"Raju");
        Thread tTaker = new Thread(tr);
        tTaker.start();
        System.out.println("the id of the thread t3 is : " + t3.getId());
        System.out.println("the name of the thread t3 is : " + t3.getName());

        
    }
}
