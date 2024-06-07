
class Stack_Implementation
{
    int stack[];
    int top;
    int size;
    int capacity;

    Stack_Implementation(int capacity)
    {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data)
    {
        if (top==capacity-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            stack[++top] = data;
        }
    }

    public int pop()
    {
        if (top==-1)
        {
            System.out.println("Stack Underflow");
            return Math.abs(Integer.MIN_VALUE);
        }
        else
        {
            return stack[top--];
        }

    }

    public int findMiddle()
    {
        if (top==-1)
        {
            System.out.println("Stack Underflow");
            return Math.abs(Integer.MIN_VALUE);
        }
        else
        {
            return stack[top/2];
        }
    }

    public int deleteMiddle()
    {
        if (top==-1)
        {
            System.out.println("Stack Underflow");
            return Math.abs(Integer.MIN_VALUE);
        }
        else
        {
            int temp = stack[top/2];

            for (int x = top/2; x<top; x++)
            {
                stack[x] = stack[x+1];
            }

            top--;
            return temp;
        }
    }
}


class stack_with_operations_on_middle_element {
    
    public static void main(String args[])
    {
        Stack_Implementation stack = new Stack_Implementation(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.findMiddle());
        System.out.println(stack.deleteMiddle());
        System.out.println(stack.findMiddle());
    }

}