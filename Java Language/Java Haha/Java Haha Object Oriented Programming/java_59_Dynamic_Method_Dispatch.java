class Phone
{
    public void showTime()
    {
        System.out.println("Time is 8 a.m");
    }
    public void on()
    {
        System.out.println("Turning on Phone.......");
    }
}

class Smartphone extends Phone
{
    public void music()
    {
        System.out.println("Playing music.........");
    }
    @Override
    public void on()
    {
        System.out.println("Turning on Smartphone.......");
    }
}

public class java_59_Dynamic_Method_Dispatch
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Understanding of Dynamic Method Understanding ----\n");

        Phone nokia = new Phone();
        nokia.on();
        nokia.showTime();
        System.out.println();

        Smartphone asus = new Smartphone();
        asus.on();
        asus.music();
        System.out.println();

        Phone karbon = new Smartphone();    // but not allowed this  Smartphone Samgsung = new Phone();
        karbon.on();
        //karbon.music();                    // NOT ALLOWED
        karbon.showTime();                   // ALLOWED
    }
}
