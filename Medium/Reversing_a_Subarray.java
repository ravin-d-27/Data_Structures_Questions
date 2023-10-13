// Given an array of n distinct integers. The task is to check whether reversing any one sub-array can make the array sorted or not. If the array is already sorted or can be made sorted by reversing any one subarray, print “Yes“, else print “No“.

// Examples: 

// Input : arr [] = {1, 2, 5, 4, 3}
// Output : Yes
// By reversing the subarray {5, 4, 3}, the array will be sorted.

// Input : arr [] = { 1, 2, 4, 5, 3 }
// Output : No

import java.util.*;
public class Reversing_a_Subarray {

    public static boolean sortedReversed(int arr[])
    {
        
        int temp[] = new int[arr.length];

        temp = arr.clone();

        Arrays.sort(temp);

        int right = 0;
        int left = 0;

        for (right = 0; right<temp.length; right++)
        {
            if (temp[right]!=arr[right])
            {
                break;
            }
        }

        for (left=arr.length-1; left>=0; left--)
        {
            if (temp[left]!=arr[left])
            {
                break;
            }
        }

        if (right>=left)
        {
            return true;
        }

        do 
        {
            right++;
            if (arr[right-1]<arr[right])
            {
                return false;
            }
        } while (right!=left);

        return true;
    }
    public static void main(String[] args) { 
  
        int arr[] = {1, 3, 2, 5, 4}; 
  
        if (sortedReversed(arr)) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 

}
