import java.util.*;

public class counting_steps
{
    static int implementCountingSteps(int n)
    {
        int k = 1;
        int prev1 = 1;
        int prev2 = 1;

        while (k<n)
        {
            int temp = prev2;
            prev2 = prev1+prev2;
            prev1 = temp;

            k++;
        }

        return prev2;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(implementCountingSteps(n)); 

        sc.close();

    }
}