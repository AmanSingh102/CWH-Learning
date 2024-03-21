class EkClass
{
    int a;

    public int getA() {
        return a;
    }

    EkClass( int a )
    {
        this.a = a;                 // This ko hatta kar dekho pata chal jayega
    }
    public int ReturnOne()
    {
        return 1;
    }
}

class DoClass extends EkClass
{
    DoClass( int c )
    {
        super(c);
        System.out.println("I am a constructor !!!!");
    }
}

public class java_57_This_and_Super_keyword
{
    public static void main(String[] args)
    {
        EkClass ec = new EkClass(65);
        System.out.println(ec.getA());
        DoClass dc = new DoClass(5);
    }
}
