import java.util.*;

public class Swap_Nodes_in_Pair {
    
    static class Node
    {
        int data;
        Node next;

        Node(int data) 
        {
            this.data = data;
            this.next = null;
        }

        static Node insert(Node head, int data) 
        {
            Node newNode = new Node(data);

            if (head == null) 
            {
                head = newNode;
            } 
            else 
            {
                Node current = head;
                while (current.next != null) 
                {
                    current = current.next;
                }
                current.next = newNode;
            }

            return head;
        }

        void display(Node head)
        {
            Node curr = head;

            while (curr!=null)
            {
                System.out.print(curr.data+"->");
                curr = curr.next;
            }

            System.out.print("NULL");
        }

        Node swapPairs(Node head)
        {
            
            Node curr = head;

            Node ans = null;
            ArrayList<Integer> arr = new ArrayList<>();

            while (curr!=null)
            {
                arr.add(curr.data);
                curr = curr.next;
            }

            for (int i = 1; i<arr.size(); i = i+2)
            {
                Collections.swap(arr,i,i-1);
            }

            System.out.println(arr);

            for (int i = 0; i<arr.size(); i++)
                ans = Node.insert(ans, arr.get(i));

            return ans;
        }

    }

    public static void main(String args[])
    {
        Node head = null;
        head = Node.insert(head, 1);
        head = Node.insert(head, 2);
        head = Node.insert(head, 3);
        head = Node.insert(head, 4);

        System.out.println("Original Linked List:");
        head.display(head);

        head.swapPairs(head);


    }
    
}
