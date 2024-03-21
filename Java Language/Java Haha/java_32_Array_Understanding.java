


public class java_32_Array_Understanding
{
    public static void main(String[] args)
    {
        //String[] Student = { "Mark","Aman","Newton","Stephen"};
        //System.out.println(Student.length);

        int[] marks = { 85,78,25,41,63,54,29,98 };
        System.out.println(marks.length);                   // Display length of array

        // Displaying the elements of an array ( using For loop )
        System.out.println("\n---- using For loop ----\n");
        for( int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("\n---- Reversing ----\n");
        for( int i = marks.length - 1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("\n---- for each loop in java ----\n");
        for( int element : marks )
        {
            System.out.println(element);

        }

    }
}
