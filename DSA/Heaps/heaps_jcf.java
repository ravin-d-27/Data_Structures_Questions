import java.util.*;

class heaps_jcf
{
    public static void main(String args[])
    {
        PriorityQueue <Integer> lst = new PriorityQueue<>(); // Less the number, higher the priority
        
        lst.add(10); // O(logn)
        lst.add(100); 
        lst.add(20);

        System.out.println(lst);
        System.out.println(lst.peek());
        System.out.println(lst.peek());


        while (!lst.isEmpty())
        {
            System.out.println(lst.peek()); // O(1)
            lst.remove(); // O(logn)
        }

        PriorityQueue <Integer> lst2 = new PriorityQueue<>(Comparator.reverseOrder()); // Less the number, lower the priority
        System.out.println();
        lst2.add(3);
        lst2.add(5);
        lst2.add(2);
        lst2.add(1);

        while (!lst2.isEmpty())
        {
            System.out.println(lst2.peek());
            lst2.remove();
        }
    }
}