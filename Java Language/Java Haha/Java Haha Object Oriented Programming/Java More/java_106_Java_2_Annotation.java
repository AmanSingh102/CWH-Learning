
@FunctionalInterface
interface MyFunctionalInterface
{
    void Method();
    //void Method2();
}

class NewPhone extends Phone
{
    @Override
    public void ring()
    {
        System.out.println("Someone is not calling");

    }

    @Deprecated
    public int Sum( int a,int b )
    {
        return a + b;
    }
}

public class java_106_Java_2_Annotation
{
    @SuppressWarnings( "deprecation" )

    public static void main(String[] args)
    {
        NewPhone phone = new NewPhone();
        phone.ring();


        phone.Sum(5,6);

    }
}
