class A
{
    public int a;
    public int aman()
    {
        return 4;
    }

    public void method2()
    {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A
{
    @Override               // not required but recommend
    public void method2()                                      // yaha kiye method overriding
    {
        System.out.println("I am method 3 of class B");
    }
    public void method3()
    {
        System.out.println("I am method 3 of class B");
    }
}

public class java_58_Method_Overriding_Understanding
{
    public static void main(String[] args)
    {
        A a = new A();
        a.method2();
        System.out.println();

        B b = new B();
        b.method2();
    }
}
