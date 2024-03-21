class Base1
{
    Base1()
    {
        System.out.println("I am a Constructor");
    }
    Base1( int x )
    {
        System.out.println("I am overloaded constructor with value of x as : " + x );
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
        System.out.println("I am a Derived Class Constructor");
    }
    Derived1( int x, int y )
    {
        super(x);
        System.out.println("I am overloaded constructor of Derived with value of y as : " + y );
    }
}
class ChildOfDerived1 extends Derived1
{
    ChildOfDerived1()
    {
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived1( int x,int y ,int z )
    {
        super(x,y);
        System.out.println("I am overloaded constructor of Derived with value of z as : " + z );
    }
}

public class java_57_Constructor_in_Inheritance_Understanding
{
    public static void main(String[] args)
    {
        Base1 b = new Base1();
        System.out.println();

        Base1 b1 = new Base1(20);
        System.out.println();

        Derived1 d = new Derived1();
        System.out.println();

        Derived1 d1 = new Derived1(20,30);
        System.out.println();

        ChildOfDerived1 cd = new ChildOfDerived1();
        System.out.println();

        ChildOfDerived1 cd1 = new ChildOfDerived1(20,30,40);
        System.out.println();
    }
}
