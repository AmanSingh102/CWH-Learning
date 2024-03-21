import java.security.PrivilegedAction;

abstract class Parent2
{
    public Parent2()
    {
        System.out.println("I am a Parent2 Constructor");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class Child2 extends Parent2
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }

    @Override
    public void greet1()
    {
        System.out.println("Good Night");
    }
}
abstract class Child3 extends Parent2
{
    public void print()
    {
        System.out.println("I am good");
    }
}
public class java_62_Abstract_Method_Classes
{
    public static void main(String[] args)
    {
        Child2 child = new Child2();
    }
}
