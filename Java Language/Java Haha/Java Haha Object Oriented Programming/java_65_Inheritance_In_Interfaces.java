 interface sampleInterface
 {
     void meth1();
     void meth2();
 }
 interface childSampleInterface extends sampleInterface
 {
     void meth3();
     void meth4();
 }
 class MySampleClass implements childSampleInterface
 {
     public void meth1() { System.out.println("Method 1"); }
     public void meth2() { System.out.println("Method 2"); }
     public void meth3() { System.out.println("Method 3"); }
     public void meth4() { System.out.println("Method 4"); }
 }

public class java_65_Inheritance_In_Interfaces
{
    public static void main(String[] args)
    {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
