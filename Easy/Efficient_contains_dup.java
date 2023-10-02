import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Efficient_contains_dup {
    

    static boolean containsDuplicate(int[] nums) 
    {
        Set <Integer> n = new HashSet<Integer>();
        
        for (int num: nums)
        {
            if (n.contains(num))
            {
                return true;
            }

            n.add(num);
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the Elements: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Code Starts

        boolean v = containsDuplicate(arr);

        System.out.println(v);

        sc.close();
    }
    
}
