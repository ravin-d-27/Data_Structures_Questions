import java.util.Scanner;

public class search_in_rotated_sorted_array {

    static int rotate_and_find(int arr[], int pivot, int target)
    {
        boolean x = false;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]==target)
            {
                x = true;
                break;
            }
            else
            {
                x = false;
            }
        }

        if (x == true)
        {
            int new_arr[] = new int[arr.length];
            int k = 0;
        
            for (int i = pivot; i<arr.length; i++)
            {
                new_arr[k] = arr[i];
                k++;
            }

            for (int i = 0; i<pivot; i++)
            {
                new_arr[k] = arr[i];
                k++;
            }

            for (int i = 0; i<arr.length; i++)
            {
                if (new_arr[i] == target)
                {
                    return i;
                }
            }
            
        }

        return -1;
        
    }
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

        // Code starts
        // [0,1,2,4,5,6,7] : pivot 3 = [4,5,6,7,0,1,2]

    System.out.println("Enter the Pivot and Target Value: ");
    int pivot = sc.nextInt();
    int target = sc.nextInt();

    System.out.println("The Index of "+target+" is: "+rotate_and_find(arr, pivot, target));

        sc.close();
    }    
}
