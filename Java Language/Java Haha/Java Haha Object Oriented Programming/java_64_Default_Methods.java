interface MyCamera
{
    void takeSnap();
    void recordVideo();
    default void record4kVideo()     // default method but not work if niche wale class me agar define kar diye ho to agar niche define nhi hoga to ye run karega
    {
        greet();
        System.out.println("4k recording.........from default method");
    }

    private void greet() { System.out.println("Satayanash ho tumhara"); }
}

interface MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling....." + phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting..........");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera
{
    public void takeSnap()
    {
        System.out.println("Taking Snap......");
    }
    public void recordVideo()
    {
        System.out.println("Recording......");
    }

   // public void record4kVideo() {   System.out.println("4k Recording Overwrite......"); }        // default method ko overwrite kar diye

    public String[] getNetworks()
    {
        System.out.println("Getting list of Networks");
        String[] networkList = { "Aman","Mohan","Mai"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to " + network);
    }
}

public class java_64_Default_Methods
{
    public static void main(String[] args)
    {
        MySmartPhone ms = new MySmartPhone();

        ms.record4kVideo();

        String[] ar = ms.getNetworks();
        for( String item : ar )
        {
            System.out.println(item);
        }

    }
}
