import java.util.Scanner;

// ---------------------- GETTER AND SETTER
class MyEmployee
{
    private int id;
    private String name;

    public void setName( String n )
    {
        name = n;
    }
    public String getName()
    {
        System.out.print("\nYour name is ");
        return this.name;                                //  Without this will also run
    }
    public void setId( int i )
    {
        id = i;
    }
    public  int getId()
    {
        System.out.print("\nYour id is ");
        return this.id;                                 //  Without this will also run
    }
}

public class java_52_Access_Modifiers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your ID : ");
        int id  = sc.nextInt();

        MyEmployee Aman = new MyEmployee();

        Aman.setName(name);
        Aman.setId(id);

        System.out.println(Aman.getName());
        System.out.println(Aman.getId());
    }
}
