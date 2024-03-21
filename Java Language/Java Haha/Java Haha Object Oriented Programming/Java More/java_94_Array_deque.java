import java.util.ArrayDeque;

public class java_94_Array_deque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad1  = new ArrayDeque<>();
        ad1.add(0);
        ad1.add(1);
        ad1.add(2);
        ad1.addFirst(98);

        System.out.println(ad1);
        System.out.println("\n---- First and Last ----");
        System.out.print(ad1.getFirst() + " ");
        System.out.println(ad1.getLast());

    }
}
