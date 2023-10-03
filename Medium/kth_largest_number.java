/*
Problem Statement:

You are given an integer array 'nums' and an integer 'k'.

Write a function 'findKthLargest' that finds and returns the k-th largest element in the array.

Function Signature: 
    static int findKthLargest(int[] nums, int k)

Input:
- An array of integers 'nums' (1 <= nums.length <= 10^4) where each element nums[i] is an integer (-10^4 <= nums[i] <= 10^4).
- An integer 'k' (1 <= k <= nums.length).

Output:
- An integer representing the k-th largest element in the array.

Example:

Input:
nums = [7, 6, 4, 3, 1], k = 2

Output:
6

Explanation:
The 2nd largest element in the array is 6.

Note:
- You may assume k is always valid, 1 ≤ k ≤ array's length.
- It is guaranteed that there will be at least k distinct elements in the array.
- The given array is not sorted, and it may contain duplicates.
*/


import java.util.Arrays;

public class kth_largest_number {

    static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }

    public static void main(String args[])
    {

        int arr[] = {7,6,4,3,1};
        System.out.println(findKthLargest(arr, 2));    
    
    }
    
}
