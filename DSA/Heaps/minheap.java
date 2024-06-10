import java.util.*;

class minheap
{
    static ArrayList <Integer> arr = new ArrayList<>();

    static void swapElements(int x, int y)
    {
        int temp = arr.get(x);
        arr.set(x, arr.get(y));
        arr.set(y,temp);

    }

    void insert(int newNode) // O(logn)
    {
        arr.add(newNode);

        int child = arr.size()-1;
        int parent = (child-1)/2;

        while (child > 0 && arr.get(child)<arr.get(parent)) // Min heap condition. 
        {
            swapElements(child, parent);
            child = parent;
            parent = (child - 1) / 2;
        }
    }

    void displayHeap()
    {
        System.out.println(arr);
    }

    void peekElement()
    {
        System.out.println(arr.get(0));
    }

    public static void main(String args[])
    {
        System.out.println("Min Heap Implementation");
        minheap heap = new minheap();
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(10);

        System.out.println("Before adding Element 1");
        heap.displayHeap();

        heap.insert(1);
        System.out.println("After Adding Element 1");
        heap.displayHeap();
    }
}