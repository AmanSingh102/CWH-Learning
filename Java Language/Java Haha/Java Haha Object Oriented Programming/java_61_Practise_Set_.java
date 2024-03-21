class Circle1
{
    public int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    Circle1(int r )
    {
        System.out.println("I am Circle parameterized Constructor");
        this.radius = r;
    }
    public double area()
    {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1
{
    Cylinder1(int r ,int h)
    {
        super(r);
        System.out.println("I am Cylinder1 parameterized Constructor");
        this.height = h;
    }
    public int height;
    public double volume()
    {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class java_61_Practise_Set_
{
    public static void main(String[] args)
    {
        Cylinder1 obj = new Cylinder1(12,9);
    }
}
