import java.util.LinkedList;

public class java_93_Linked_List
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        LinkedList<Integer> l4 = new LinkedList<>();


        l3.add(18);
        l3.add(27);
        l3.add(49);

        l1.add(6);
        l1.add(9);
        l1.add(2);

        l1.addLast(88);
        l1.addFirst(99);

        l1.add(5);
        l1.add(8);
        l1.addAll(l3);
        l1.addLast(789);
        for( int i = 0; i<l1.size(); i++ )
        {
            System.out.println(l1.get(i));
        }


        System.out.println();
        l2.add(9898);
        l2.add(9641);
        l2.add(2566);
        l2.add(0,5564);
        l2.add(0,8978);
        l2.clear();
        for( int i = 0; i<l2.size(); i++ )
        {
            System.out.println(l2.get(i));
        }

        System.out.println("---- fOR FIND AN ELEMENT ----");
        l4.add(4);
        l4.add(21);
        l4.add(26);
        l4.add(6);
        l4.add(9);
        l4.add(2);
        l4.add(5);
        l4.add(8);
        l4.add(6);
        l4.set(1,10000);

        System.out.println(l4.contains(9));
        System.out.println(l4.contains(10));
        System.out.println(l4.indexOf(10));
        System.out.println(l4.indexOf(9));
        System.out.println(l4.indexOf(5));
        System.out.println(l4.indexOf(6));
        System.out.println(l4.lastIndexOf(6));

        System.out.println();

        for( int i = 0; i<l4.size(); i++ )
        {
            System.out.print(l4.get(i));
            System.out.print(", ");
        }



    }
}
