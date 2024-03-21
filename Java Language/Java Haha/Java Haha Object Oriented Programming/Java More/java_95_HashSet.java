import java.util.HashSet;

public class java_95_HashSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> MyHashSet = new HashSet<>(6,0.5F);

        MyHashSet.add(0);
        MyHashSet.add(1);
        MyHashSet.add(2);
        MyHashSet.add(3);
        MyHashSet.add(4);
        MyHashSet.add(5);

        System.out.println(MyHashSet);
    }
}
