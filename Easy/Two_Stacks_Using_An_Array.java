
// Implementation of Two Stacks using a single array


public class Two_Stacks_Using_An_Array {

    static int stack[] = new int[10];

    int top1 = 0;
    int top2 = 5;

    private static void add(int index, int element)
    {
        stack[index] = element;
    }

    private static void remove(int index)
    {
        stack[index] = 0;
    }

    public void push1(int element)
    {
        if (top1<5)
        {
            add(top1, element);
            top1++;
        }
        else
        {
            System.out.println("Stack 1 is full");
        }
        
    }

    public void push2(int element)
    {
        if (top2<10)
        {
            add(top2,element);
            top2++;
        }
        else
        {
            System.out.println("Stack 2 is full");
        }
        
    }

    public void pop1()
    {
        if (top1>0)
        {
            top1--;
            remove(top1);

        }
        else
        {
            System.out.println("Stack 1 is Empty");
        }
        
    }

    public void pop2()
    {
        if (top2>5)
        {
            top2--;
            remove(top1);

        }
        else
        {
            System.out.println("Stack 2 is Empty");
        }
        
    }

    public void display1()
    {
        for (int i = 0; i<top1; i++)
        {
            System.out.print(stack[i]+" ");
            
        }
        System.out.println(" ");
    }

    public void display2()
    {
        for (int i = 5; i<top2; i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String args[])
    {
        Two_Stacks_Using_An_Array obj =  new Two_Stacks_Using_An_Array();
        obj.push2(10);
        obj.push2(10);
        obj.push2(10);
        obj.push2(10);
        obj.push2(10);
        obj.display2();
        obj.push2(10);

        

        obj.pop2();
        obj.pop2();
        obj.pop2();
        obj.push1(20);
        obj.display1();
        
    }
    
}
