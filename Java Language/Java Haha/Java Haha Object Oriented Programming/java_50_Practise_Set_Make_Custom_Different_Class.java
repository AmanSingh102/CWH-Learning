class Employee_Practise_set
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName( String n )
    {
        name = n;
    }
}

class CellPhone
{
    public void ring()
    {
        System.out.println("Ringing.....");
    }
    public void vibrate()
    {
        System.out.println("Vibrating.....");
    }
    public void CallFriend()
    {
        System.out.println("Calling Suresh.....");
    }
}

public class java_50_Practise_Set_Make_Custom_Different_Class
{
    public static void main(String[] args)
    {
        System.out.println("\n ---- Problem 1 ---- ");
        Employee_Practise_set aman = new Employee_Practise_set();
        aman.setName("Aman");
        aman.salary = 289;
        System.out.println(aman.getName());
        System.out.println(aman.getSalary());

        System.out.println("\n ---- Problem 2 ---- ");
        CellPhone asus = new CellPhone();
        asus.CallFriend();
        asus.vibrate();
        asus.ring();
    }
}
