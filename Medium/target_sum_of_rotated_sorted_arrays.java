/*
Problem Statement:

You are given a rotated sorted array and a target sum. Your goal is to determine whether there are two distinct elements in the array that add up to the target sum.

Write a function 'find_sum' that takes an integer array 'arr' and an integer 'target' and returns true if there are two distinct elements in the array that add up to the target sum, and false otherwise.

Function Signature: 
    static boolean find_sum(int arr[], int target)

Input:
- An integer array 'arr' (2 <= arr.length <= 10^4), where each element 'arr[i]' (0 <= arr[i] <= 10000) represents an element of the rotated sorted array. The array is guaranteed to be rotated at some pivot point.
- An integer 'target' (0 <= target <= 20000) represents the target sum.

Output:
- A boolean value. Return true if there are two distinct elements in the array that add up to the target sum, and false otherwise.

Example:

Input:
arr = [5,8,11,3,7], target = 13

Output:
true

Explanation:
In this case, the distinct elements 5 and 8 add up to the target sum 13.

Note:
- The array is guaranteed to be rotated at some pivot point.
- You may assume that each input would have exactly one solution.
- The same element cannot be used twice.
*/



class target_sum_of_rotated_sorted_arrays
{

    static boolean find_sum(int arr[], int target)
    {
        int pivot = 0;

        for (pivot = 0; pivot < arr.length-1; pivot++)
        {
            if (arr[pivot]>arr[pivot+1])
            {
                break;
            }
        }

        int l = (pivot+1)%arr.length;
        int r = pivot;

        

        while (l!=r)
        {
    
            if (arr[l]+arr[r]==target)
                return true;
            
            if (arr[l]+arr[r]<target)
                l = (l+1)%arr.length;
            else
                r = (arr.length+r-1)%arr.length;
        
        }
        return false;

    }
    public static void main(String args[])
    {
        int arr[] = {5,8,11,3,7};
        int target = 13;

        System.out.println(find_sum(arr, target));
    }
}