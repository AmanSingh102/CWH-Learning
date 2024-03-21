interface DemoAno
{
    void meth1();
    void meth2();
}

class AnonyDemo implements DemoAno
{
    public void display()
    {
        System.out.println("Hello");
    }

    @Override
    public void meth1()
    {
        System.out.println("I am Method 1");
    }

    @Override
    public void meth2()
    {
        System.out.println("I am Method 2");
    }
}


// LAMBDA EXPRESSION
@FunctionalInterface
interface oneMethod
{
    void methOne(int a);
}

class Aman implements oneMethod
{
    @Override
    public void methOne(int a)
    {
        System.out.println("I am Method One from one method interface = " + a);
    }
}

public class java_107_Lambda
{
    public static void main(String[] args)
    {
        AnonyDemo obj0  = new AnonyDemo();
        obj0.meth1();

        DemoAno obj  = new AnonyDemo();
        obj.meth1();

        System.out.println("\n---- Anonymous class -----");
        DemoAno obj1 = new DemoAno()
        {
            @Override
            public void meth1()
            {
                System.out.println("I am Method 1 [ Anonymous class ]");
            }

            @Override
            public void meth2()
            {
                System.out.println("I am Method 2 [ Anonymous class ]");

            }
        };

        obj1.meth1();
        System.out.println("---------------------------------------");

        System.out.println("\n---- Lambda Expression -----");
        Aman obj00 = new Aman();
        obj00.methOne(9);

        System.out.println("\n---- Lambda Expression Yaha se Hai -----");
        oneMethod obj01 = (a) ->
        {
            System.out.println("I am Method One from one method interface [ Lambda Expression ] = " + a);
        };

        obj01.methOne(99);



    }
}
