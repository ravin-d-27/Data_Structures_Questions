// Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. The expected Time Complexity is O(n2).
// Examples: 
 

// Input : arr[] = {-2, 0, 1, 3}
//         sum = 2.
// Output : 2
// Explanation :  Below are triplets with sum less than 2
//                (-2, 0, 1) and (-2, 0, 3) 

// Input : arr[] = {5, 1, 3, 4, 7}
//         sum = 12.
// Output : 4
// Explanation :  Below are triplets with sum less than 12
//                (1, 3, 4), (1, 3, 5), (1, 3, 7) and 
//                (1, 4, 5)

import java.util.*;

public class Count_triplets_with_sum_smaller_than_a_given_value {

    public int findTriplets(int arr[], int sum)
    {
        int ans = 0;
        
        Arrays.sort(arr);

        for (int i = 0; i<arr.length-2; i++)
        {

            int left = i+1;
            int right = arr.length-1;

            while (left<right)
            {
                int sum_temp = arr[left]+arr[right]+arr[i];
                if (sum_temp>=sum)
                {
                    right--;
                }
                else
                {
                    ans+=(right-left);
                    left++;
                }
            }
        }


        return ans;
    }

    public static void main(String args[])
    {
        int arr[] = {5, 1, 3, 4, 7}; ;
        int sum = 12; 
        Count_triplets_with_sum_smaller_than_a_given_value obj = new Count_triplets_with_sum_smaller_than_a_given_value();
        System.out.println(obj.findTriplets(arr, sum));
    }
    
}
