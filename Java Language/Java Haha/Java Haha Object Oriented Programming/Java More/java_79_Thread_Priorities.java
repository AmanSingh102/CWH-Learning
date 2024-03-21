class MyThrPriority extends Thread
{
    public MyThrPriority(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while( i < 2 )
        {
            System.out.println("Thank you for Calling me " + this.getName());
            i++;
        }
    }
}

public class java_79_Thread_Priorities
{
    public static void main(String[] args)
    {
        // Ready Queue : All Threads that are ready to run [ T1 T2 T3 T4 T5 ]

        MyThrPriority t1 = new MyThrPriority("Aman 1");
        MyThrPriority t2 = new MyThrPriority("Aman 2");
        MyThrPriority t3 = new MyThrPriority("Aman 3");
        MyThrPriority t4 = new MyThrPriority("Aman 4");
        MyThrPriority t5 = new MyThrPriority("Aman 5");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
