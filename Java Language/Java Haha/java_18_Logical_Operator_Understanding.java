public class java_18_Logical_Operator_Understanding
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Logical Operators ---- ");

        System.out.println("\n---- Logical AND and OR Operators ---- ");
        boolean a = true ;
        boolean b = true ;

        if( a && b  )
            System.out.println("Ture");
        else
            System.out.println("False");

        if( a || b  )
            System.out.println("Ture");
        else
            System.out.println("False");


        System.out.println("\n---- Logical AND and OR Operators ---- ");
        boolean d = true ;
        boolean e = false ;

        if( d && e  )
            System.out.println("Ture");
        else
            System.out.println("False");


        if( d || e  )
            System.out.println("Ture");
        else
            System.out.println("False");


        System.out.println("\n---- Logical Not operator ---- ");
        System.out.print("NOT(d) is ");
        System.out.println(!d);
        System.out.print("NOT(e) is ");
        System.out.println(!e);
    }
}
