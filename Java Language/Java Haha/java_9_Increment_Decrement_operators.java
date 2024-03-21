public class java_9_Increment_Decrement_operators
{
    public static void main(String[] args)
    {
        // INCREMENT AND DECREMENT
        System.out.println("a++ increment give 30");
        int num = 30;
        System.out.println(num++);
        System.out.println(num);

        System.out.println("++a increment given 40");
        int num2 = 40;
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("a-- decrement given 50");
        int num3 = 50;
        System.out.println(num3--);
        System.out.println(num3);

        System.out.println("--a decrement given 60");
        int num4 = 60;
        System.out.println(--num4);
        System.out.println(num4);

        System.out.println("---- Example ----");
        int x = 7;
        int y = ++x * 8;
        System.out.println(y);

        System.out.println("---- Example 2 ----");
        char ch = 'A';
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(++ch);
        System.out.println(++ch);
    }
}
