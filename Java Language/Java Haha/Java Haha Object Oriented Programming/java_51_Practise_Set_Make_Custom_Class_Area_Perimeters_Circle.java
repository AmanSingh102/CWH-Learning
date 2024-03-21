import java.util.Scanner;

class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4 * side;
    }
}
class Rectangle
{
    int length,breadth;
    public int area()
    {
        return length * breadth;
    }
    public int perimeter()
    {
        return   2 * ( length + breadth )  ;
    }
}
class Circle
{
    float radius;
    public float area()
    {
        return 3.14F * radius * radius ;
    }
    public float perimeter()
    {
        return   2 * 3.14f * radius  ;
    }
}
class GTA
{
    public void hit()
    {
        System.out.println("Hitting the enemy.....");
    }
    public void run()
    {
        System.out.println("Running from the enemy.....");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy.....");
    }
}

public class java_51_Practise_Set_Make_Custom_Class_Area_Perimeters_Circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n ---- Problem 3 ---- ");
            Square sq = new Square();
            System.out.print("Enter the Side of Square : ");
            sq.side = sc.nextInt();
            System.out.println("The Area of Square is " + sq.area());
            System.out.println("The Perimeter of Square is " + sq.perimeter());

            System.out.println("\n ---- Problem 4 ---- ");
            Rectangle rec = new Rectangle();
            System.out.print("Enter the Side of Length of Rectangle : ");
            rec.length = sc.nextInt();
            System.out.print("Enter the Side of Breadth of Rectangle : ");
            rec.breadth = sc.nextInt();
            System.out.println("The Area of Rectangle is " + rec.area());
            System.out.println("The Perimeter of Rectangle is " + rec.perimeter());

            System.out.println("\n ---- Problem 6 ---- ");
            Circle cir = new Circle();
            System.out.print("Enter the Radius of the Circle : ");
            cir.radius = sc.nextInt();
            System.out.println("The Area of Circle is " + cir.area());
            System.out.println("The Perimeter of Circle is " + cir.perimeter());

            System.out.println("\n ---- Problem 5 ---- ");
            GTA player1 = new GTA();
            player1.fire();
            player1.run();
            player1.hit();

        sc.close();
    }
}
