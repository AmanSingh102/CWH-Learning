class Employee
{
    int id;
    int salary;
    int PhoneNumber;
    String name;
    public void PrintDetails()
    {
        System.out.println();
        System.out.println("My ID is  " + id );
        System.out.println("My Name is " + name );
        System.out.println("The Salary is " + salary );
    }
    public int getNumber()
    {
        System.out.print("Phone number : ");
        return PhoneNumber;
    }
}

public class java_49_Custom_Class
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom Class");

        // Instantiating a New Employee Object
        Employee aman  = new Employee();
        Employee pado = new Employee();

        // Setting Attributes ( Properties ) for aman
        aman.id = 101;
        aman.name = "Aman Singh";
        aman.salary = 90;
        aman.PhoneNumber = 985746241;

        // Setting Attributes ( Properties ) for pado
        pado.id = 102;
        pado.name = "Padu Prasad";
        pado.salary = 95;
        pado.PhoneNumber = 987567785;

        // Printing the Attributes
        System.out.println(aman.id);
        System.out.println(aman.name);

        // Calling the method      [ uper wala se accha hai ye method bana ke print karna ]
        aman.PrintDetails();
        System.out.println(aman.getNumber());
        pado.PrintDetails();
        System.out.println(pado.getNumber());
    }
}
