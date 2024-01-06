class Queue_Implementation
{   
    int front, rear, size;
    int capacity;
    int array[];

    public Queue_Implementation(int max_capacity)
    {
        this.capacity = max_capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    void enqueue(int element)
    {
        if (size == capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        else
        {
            rear = (rear + 1) % capacity;
            array[rear] = element;
            size++;
            System.out.println(element + " enqueued to queue");
        }
    }

    int dequeue()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        else
        {
            int element = array[front];
            front = (front + 1) % capacity;
            size--;

            return element;
        }
    }

    void Queue_reverse()
    {
        for (int i = 0; i<size/2; i++)
        {
            int temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }
    }

    void display()
    {
        for (int i = 0; i<size; i++)
        {
            System.out.println(array[i]);
        }
    }
}

class Queue_Reversal
{
    public static void main(String[] args)
    {
        Queue_Implementation queue = new Queue_Implementation(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue before reversal");
        queue.display();

        queue.Queue_reverse();
        System.out.println("Queue after reversal");
        queue.display();
    }
}