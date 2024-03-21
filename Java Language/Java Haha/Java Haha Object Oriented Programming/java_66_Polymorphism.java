interface MyCamera2
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

interface MyWifi2
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2
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

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2
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

    public void sampleMeth() {
        System.out.println("meth");
    }
}


public class java_66_Polymorphism
{
    public static void main(String[] args)
    {
        MyCamera2 cam1 = new MySmartPhone2();   // THIS IS A SMARTPHONE BUT ONLY USE AS A CAMERA
        System.out.println("\n ---- My Camera ----");
        cam1.record4kVideo();
        // cam1.getNetworks();              // YOU CAN'T ACCESS   NOT ALLOWED FOR CODE
        // cam1.sampleMeth();               // NOT ALLOWED FOR CODE

        System.out.println("\n ---- My Smart Phone ----");
        MySmartPhone2 msp2 = new MySmartPhone2();
        msp2.sampleMeth();
        msp2.record4kVideo();
        msp2.getNetworks();
        msp2.recordVideo();
        msp2.takeSnap();
        msp2.callNumber(899899898);
        msp2.connectToNetwork("Amannn");
    }
}
