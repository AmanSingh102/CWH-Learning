/**
 * This is a good Class
 */

public class java_105_Method_Tags
{
    /**
     *
     * @param args These are arguments supplied to the command line
     */

    public static void main(String[] args)
    {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method and this is the most beautiful method
     * @param a This is the First number to add
     * @param b This is the Second number to add
     * @return sum of two numbers as an integer
     * @throws Exception If i is 0
     * @deprecated This method iss deprecated please use + operator
     */

    public int add( int a, int b ) throws Exception {
        if (a == 0) {
            throw new Exception();
        }

        int c;
        c = a + b;
        return c;
    }

}
