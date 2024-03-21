import java.util.ArrayList;

class MyGeneric<T1, T2>
{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2)
    {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public int getVal() { return val; }
    public void setVal( int val ) { this.val = val; }
    public T1 getT1() { return t1; }
    public void setT1( T1 t1 ) { this.t1 = t1; }
    public T2 getT2() { return t2; }
    public void setT2( T2 t2 ) { this.t2 = t2; }

}
public class java_108_Generics
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(124);
        arrayList.add(754);
        int a = arrayList.get(0);
        int a1 = arrayList.get(1);
        int a2 = arrayList.get(2);
        System.out.println( a + " " + a1 + " " + a2 );

        System.out.println("\n---- Generic Class ----");

        MyGeneric<String, Integer > g1 = new MyGeneric<>(23,"MyString",55);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str);
        System.out.println( str + " " + int1 );
    }
}
