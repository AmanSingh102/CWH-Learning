public class java_26_Practise_Set_Break_And_Continue
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Break ----");
        for( int i = 0; i<5; i++ )
        {
            System.out.println(i);
            System.out.println("Java is Great");

            if( i==2 )
            {
                System.out.println("Ending of the loop");
                break;
            }
        }

        System.out.println("\n---- Continue ----");
        for( int i = 0; i<5; i++ )
        {
            if (i == 2) {
                System.out.println("Ending of the loop");
                continue;
            }

            System.out.println(i);
            System.out.println("Java is Great");
        }

    }
}
