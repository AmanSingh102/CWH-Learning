class Base {
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I'm in base and setting x now");
        this.x = x;
    }
    public void Print_here() {
        System.out.println("I'm Constructor");
    }
}

class Derived extends Base       // jo v base class me hai wo derived me aa gaya ab derived kuch add kar sakte
{
    public int y;
    public int getY() {
        System.out.println("\nI'm in derived and setting y now");
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}


public class java_56_Inheritance_Understanding
{
    public static void main(String[] args)
    {
        // CREATING AN OBJECT OF BASE CLASS
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        System.out.println();

        // CREATING AN OBJECT OF DERIVED CLASS
        Derived d = new Derived();
        d.setX(43);
        d.setY(53);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
