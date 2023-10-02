import java.util.Scanner;

public class contrains_duplicate {

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

        boolean v = false;
        
        for (int i = 0; i<arr.length; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    v = true;
                    break;
                }
            }

            if (v)
            {
                break;
            }
        }

        System.out.println(v);
                
        


        sc.close();
    }
    
}
