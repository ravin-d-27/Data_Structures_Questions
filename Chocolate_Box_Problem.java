import java.util.Scanner;
import java.util.Arrays;

public class Chocolate_Box_Problem {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the Elements: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Code Starts

        Arrays.sort(arr);
        
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
       

        int globalmin = Integer.MAX_VALUE;
        for (int i = 0; i+m-1<arr.length; i++)
        {
            int temp = arr[i+m-1]-arr[i];
            globalmin = Math.min(globalmin, temp);

        }

        System.out.println("The Minimum Difference is: "+globalmin);

        sc.close();
    }
}
