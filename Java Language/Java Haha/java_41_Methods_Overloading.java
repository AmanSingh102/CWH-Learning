public class java_41_Methods_Overloading
{
    static void string()
    {
        System.out.println("Good Morning yo !!! ");
    }
    static void string(int a)
    {
        System.out.println("Good Morning " + a + " yo !!! ");
    }
    static void string(int a,int b)
    {
        System.out.println("Good Morning " + a + " yo !!! ");
        System.out.println("Good Morning " + b + " yo !!! ");
    }

    public static void main(String[] args)
    {
        // ------------------- naam ek kaam bahut ----------------------------------------
        string();
        string(30000);
        string(3000,4000);
    }
}
