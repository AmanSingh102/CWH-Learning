import java.util.Scanner;

class Cylinder
{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    // ---- SURFACE AREA OF CYLINDER ----
    public double SurfaceArea()
    {
        return  ( 2 * Math.PI * radius * height ) + ( 2 * Math.PI * radius * radius ) ;
    }
    // ---- VOLUME OF THE CYLINDER ----
    public double Volume()
    {
        return ( Math.PI * radius * radius * height ) ;
    }
}

class Cylinder_Using_Constructor
{
    private final int radius;
    private final int height;

    public Cylinder_Using_Constructor(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // ---- SURFACE AREA OF CYLINDER ----
    public double SurfaceArea()
    {
        return  ( 2 * Math.PI * radius * height ) + ( 2 * Math.PI * radius * radius ) ;
    }
    // ---- VOLUME OF THE CYLINDER ----
    public double Volume()
    {
        return ( Math.PI * radius * radius * height ) ;
    }

}

class Sphere
{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double SurfaceArea()
    {
        return ( 4 * Math.PI * radius * radius );
    }
    public double Volume()
    {
        return ( (double) 4 / 3 * Math.PI * radius * radius * radius );
    }
}

class Rectangle1
{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class java_55_Height_Radius_And_Find_the_SurfaceArea_Volume_of_the_Cylinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            Cylinder MyCylinder = new Cylinder();

            // ---- PROBLEM 1 AND 2 ----
            System.out.print("Enter the Radius of the Cylinder : ");
            int radius = sc.nextInt();
            MyCylinder.setRadius(radius);
            System.out.println("Radius = " + MyCylinder.getRadius());

            System.out.print("Enter the Height of the Cylinder : ");
            int height = sc.nextInt();
            MyCylinder.setHeight(height);
            System.out.println("Height = " + MyCylinder.getHeight());

            System.out.println("\nSurface Area of Cylinder = " + MyCylinder.SurfaceArea());
            System.out.println("Volume of Cylinder = " + MyCylinder.Volume());

            // ---- PROBLEM 3 ----
            Cylinder_Using_Constructor Constructor_Cylinder = new Cylinder_Using_Constructor(9,12);
            System.out.println("\nSurface Area of Cylinder = " + Constructor_Cylinder.SurfaceArea());
            System.out.println("Volume of Cylinder = " + Constructor_Cylinder.Volume());

            // ---- PROBLEM 5 ----
            Sphere sphere = new Sphere();
            System.out.print("\nEnter the Radius of the Sphere : ");
            int Sphere_radius = sc.nextInt();
            sphere.setRadius(Sphere_radius);
            System.out.println("Radius = " + sphere.getRadius());

            System.out.println("\nSurface Area of Cylinder = " + sphere.SurfaceArea());
            System.out.println("Volume of Cylinder = " + sphere.Volume());
            System.out.println();

                // ---- PROBLEM 4 ----
            Rectangle1 rec = new Rectangle1();        // for default :- Rectangle1 rec = new Rectangle1();
            System.out.println(rec.getLength());
            System.out.println(rec.getBreadth());

        sc.close();
    }
}
