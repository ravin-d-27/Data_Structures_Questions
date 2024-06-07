public class Queues_implementation
{
    int n = 5;
    int queue[] = new int[n];
    int front = 0;
    int rear = 0;

    void enqueue(int element)
    {
        if (front==rear && front<n && rear>=0)
        {
            queue[front] = element;
            front++;
        }
        else if (rear<front && front<n && rear>=0)
        {
            queue[front] = element;
            front++;
        }
        else
        {
            System.out.println("Queue is full, Front: "+front+" Rear: "+rear);
        }
    }

    void dequeue()
    {
        if (rear<front && rear<n && rear>=0)
        {
            queue[rear] = 0;
            rear++;
        }
        else
        {
            System.out.println("Queue is empty, Front: "+front+" Rear: "+rear);
        }
    }

    void display()
    {
        for (int i = rear; i<front; i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println(" ");
        
    }

    public static void main(String args[])
    {
        Queues_implementation obj = new Queues_implementation();
        obj.enqueue(100);
        obj.enqueue(200);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue(); // Try to dequeue more elements than enqueued
        obj.display();


    }
}