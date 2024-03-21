public class java_8_Precedence_and_Associativity
{
    public static void main(String[] args)
    {
        // precedence     :-  ( *,/ )  >  ( +,- )
        // associativity  :-  LEFT ---- to ---- RIGHT

        int a = 6*5 - 34/2;
                /* a = 30 - 34/2
                     = 30 - 17
                     = 13
                 */

        int b = 60/5 - 34*2;
                /* b = 12 - 34*2
                     = 12 - 68
                     = -56
                */

        System.out.println(a);
        System.out.println(b);
    }
}
