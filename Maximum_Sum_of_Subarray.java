import java.util.*;

public class Maximum_Sum_of_Subarray {


    static int sum(int arr[])
    {
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
        }

        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the Elements: ");

        for (int i = 0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Code Starts
        int max = arr[0];
        int temp = arr[0];
        
        for (int i = 1; i<num; i++)
        {
            temp = Math.max(arr[i], arr[i]+temp);

            if (temp>max)
                max = temp;
        }

        System.out.println(max);

        sc.close();
    }

}
