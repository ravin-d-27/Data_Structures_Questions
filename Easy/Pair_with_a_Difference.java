/*
     * Finds pairs of elements in the array 'arr' such that the absolute difference
     * between the elements equals 'n'.
     *
     * @param arr The input array of integers.
     * @param n   The target absolute difference.
     * @return    A List containing pairs of elements that satisfy the condition.
     */
import java.util.*;
public class Pair_with_a_Difference {
    public List<Integer> differencePair(int arr[], int n)
    {
        List <Integer> lst = new ArrayList<>();
        // Bruteforce:

        for (int i = 0; i<arr.length; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if (Math.abs(arr[i]-arr[j])==n)
                {
                    lst.add(arr[i]);
                    lst.add(arr[j]);
                }
            }
        }


        return lst;
    }

    public List<Integer> differencePairOptimized(int arr[], int n)
    {
        List <Integer> lst = new ArrayList<>();
        
        for (int i = 0; i<arr.length; i++)
        {
            int right = i;
            int left = i;

            while (right<arr.length && left>=0)
            {
                if (Math.abs(arr[left]-arr[right])==n)
                {
                    lst.add(arr[left]);
                    lst.add(arr[right]);
                }

                left--;
                right++;
            }
        }


        return lst;
    }

    public static void main(String args[])
    {
        
        Pair_with_a_Difference obj = new Pair_with_a_Difference();
        int arr[] = {5,20,3,2,50,80};
        System.out.println(obj.differencePairOptimized(arr, 78));
    }
    
}
