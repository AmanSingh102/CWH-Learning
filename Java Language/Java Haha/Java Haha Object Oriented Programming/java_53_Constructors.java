
class MyNewEmployee
{
    private int id;
    private String name;

    public MyNewEmployee()                    // Constructor
    {
        id = 45;
        name = "Padu";
    }

    public MyNewEmployee( String Myname , int MyId )                    // Constructor
    {
        id = MyId;
        name = Myname;
    }

    public MyNewEmployee( String Myname )                    // Constructor
    {
        name = Myname;
    }


    public void setName( String n ) { name = n; }                                                   // Constructor
    public String getName()   {  System.out.print("Your name is ");   return this.name;    }        // Constructor
    public void setId( int i ) {  id = i;  }
    public  int getId()       {  System.out.print("Your id is ");     return this.id;      }        // Constructor
}

public class java_53_Constructors
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String name = sc.nextLine();
//        System.out.print("Enter your ID : ");
//        int id  = sc.nextInt();

        MyNewEmployee Aman = new MyNewEmployee( "Aman", 52 );      // Constructor
        MyNewEmployee Padu = new MyNewEmployee();                                   // Constructor
        MyNewEmployee OnlyName = new MyNewEmployee("Mosi Mosi");            // Constructor

//        Aman.setName(name);
//        Aman.setId(id);

        System.out.println(Aman.getName());                 // Constructor
        System.out.println(Aman.getId() + "\n" );                   // Constructor

        System.out.println(Padu.getName());                 // Constructor
        System.out.println(Padu.getId() + "\n" );                   // Constructor

        System.out.println(OnlyName.getName() + "\n" );             // Constructor

    }
}
