public class Postfix_Expression_Evaluation {

    public int[] stack = new int[100];
    int top = 0;

    int ans = 0;

    void push(int element)
    {
        if (top<100)
        {
            stack[top] = element;
            top++;
        }
        else
        {
            System.out.println("The Stack is full");
        }
    }

    int pop()
    {
        int x = -1;
        if (top>0)
        {
            top--;
            x= stack[top];
            return x;
        }
        else
        {
            System.out.println("The Stack is empty");
            
        }

        return x;
    }

    public void postfixEval(char x)
    {

        if (x != '+' && x != '-' && x != '*' && x != '/')
        {
            push(x-'0');
        }
        else
        {
            int a = pop();
            int b = pop();

            if (x == '+')
            {
                int temp = b+a;
                push(temp);
            }
            else if (x == '-')
            {
                int temp = b-a;
                push(temp);
            }
            else if (x == '*')
            {
                int temp = b*a;
                push(temp);
            }
            else if (x == '/')
            {
                int temp = b/a;
                push(temp);
            }
            else
            {
                System.out.println("Invalid operation");
            }
            
        }

    }

    public void display()
    {
        for (int i = 0; i<top; i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String args[])
    {
        String s = "1 2 + 2 / 5 * 7 +";
        Postfix_Expression_Evaluation obj = new Postfix_Expression_Evaluation();
        for (int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i)!=' ')
                obj.postfixEval(s.charAt(i));

        }

        System.out.println(obj.stack[0]);
    }
}
