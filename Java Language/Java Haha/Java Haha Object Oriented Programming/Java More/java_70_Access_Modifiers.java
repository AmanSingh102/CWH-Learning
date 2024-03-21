import org.w3c.dom.ls.LSOutput;

class C1
{
    public int x = 5;
    protected int y = 55;
    int z = 8;
    private int a = 99;

    public void meth1()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
    }
}

class C2 extends C1
{
    public void meth2()
    {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        //System.out.println("a = " + a);     private not use sub class
    }
}

public class java_70_Access_Modifiers
{
    public static void main(String[] args)
    {
        C1 c = new C1();

        System.out.println("---- Same Class Understanding ----");
        c.meth1();

        System.out.println("\n---- Same Class Understanding ----");
        System.out.println("x = " + c.x);
        System.out.println("y = " + c.y);
        System.out.println("z = " + c.z);
        //System.out.println(c.a);   //private can not be used in same package

        System.out.println("\n---- Same Subclass Understanding ----");
        C2 cc = new C2();
        cc.meth2();
        System.out.println("\n----  ----");
        System.out.println("x = " + cc.x);
        System.out.println("y = " + cc.y);
        System.out.println("z = " + cc.z);
        //System.out.println(cc.a);   //private can not be used in Subclass
    }

}
