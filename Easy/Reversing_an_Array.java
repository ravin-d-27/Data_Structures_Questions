import java.util.*;

public class Reversing_an_Array {
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

        for (int i = num-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
