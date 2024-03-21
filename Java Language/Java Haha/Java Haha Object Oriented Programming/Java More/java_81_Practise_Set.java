class PractiseSet13A extends Thread
{
    public void run()
    {
        int i = 0;
        while( i < 5 )
        {
            try
            {
                Thread.sleep(200);
            }
            catch( Exception e )
            {
                System.out.println(e);
            }

            System.out.println("Good Morning !!!");
            i++;
        }
    }
}

class PractiseSet13B extends Thread
{
    public void run()
    {
        int i = 0;
        while( i < 5 )
        {
            System.out.println("Welcome !!!");
            i++;
        }
    }
}

public class java_81_Practise_Set
{
    public static void main(String[] args)
    {
        PractiseSet13A psa = new PractiseSet13A();
        PractiseSet13B psb = new PractiseSet13B();

        psa.setPriority(6);   // NORMAL PRIORITY IS 5
        psb.setPriority(9);

        System.out.println("Priority of psa is " + psa.getPriority());
        System.out.println("Priority of psb is " + psb.getPriority());

        System.out.println();

        System.out.println("State of psa Before Running is " + psa.getState());
        System.out.println("State of psb Before Running is " + psb.getState());

        System.out.println();

        psa.start();
        psb.start();

        System.out.println("State of psa After Running is " + psa.getState());
        System.out.println("State of psb After Running is " + psb.getState());

        System.out.println();

        System.out.println("Current status of the Tread : " + Thread.currentThread().getState());

        System.out.println();
    }
}
