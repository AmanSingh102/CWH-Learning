interface Bicycle
{
    int a = 100;
    void applyBreak( int decrement );
    void speedUp( int increment );
}

interface HornBicycle
{
    void blowHorn123();
    void blowHorn321();
}
class AvonCycle implements Bicycle,HornBicycle
{
    void blowHorn()
    {
        System.out.println("Pee Pee Poo Poo");
    }
    public void     applyBreak( int decrement )
    {
        System.out.println("Applying Break");
    }
    public void speedUp( int increment )
    {
        System.out.println("Applying speedUp");
    }

    public void blowHorn123()
    {
        System.out.println("Moye Moye Moye Moye");
    }
    public void blowHorn321()
    {
        System.out.println("Mosi Mosi Mosi Mosi");
    }
}

public class java_63_Interfaces
{
    public static void main(String[] args)
    {
        AvonCycle AmanCycle = new AvonCycle();

        AmanCycle.blowHorn();
        AmanCycle.applyBreak(1);
        AmanCycle.speedUp(2);
        // You can create the properties in Interface
        System.out.println(AmanCycle.a);
        // But you cannot modify the properties in Interface as they are final
        // AmanCycle.a = 456;

        AmanCycle.blowHorn123();
        AmanCycle.blowHorn321();

    }
}
