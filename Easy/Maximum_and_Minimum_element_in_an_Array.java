import java.util.*;

public class Maximum_and_Minimum_element_in_an_Array
{
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
        int min = arr[0];
        for (int i = 1; i<num; i++)
        {
            if (max<arr[i])
                max = arr[i];
            if (min>arr[i])
                min = arr[i];
        }

        System.out.println("The Maximum Element is: "+max);
        System.out.println("The Minimum Element is: "+min);

        sc.close();
    }
}