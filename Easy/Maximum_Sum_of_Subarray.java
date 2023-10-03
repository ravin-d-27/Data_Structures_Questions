/*
Problem Statement:

You are given an array of integers. Your task is to find the maximum sum of a subarray within the array.

Write a program to find the maximum sum of a subarray within the array.

Write a function 'findMaximumSubarraySum' that takes an integer array 'arr' and returns the maximum sum of a subarray.

Function Signature: 
    public static int findMaximumSubarraySum(int[] arr)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the elements of the array. The elements of 'arr' will be integers in the range [-10^9, 10^9].

Output:
- An integer representing the maximum sum of a subarray within the array.

Example:

Input:
arr = [3, -2, 1, -3, 4, -1, 2, 1, -5, 4]

Output:
6

Explanation:
- The subarray with the maximum sum is [4, -1, 2, 1], which has a sum of 6.

Note:
- You may assume that there is always at least one element in the array.
*/



import java.util.*;

public class Maximum_Sum_of_Subarray {

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
        int max = arr[0];
        int temp = arr[0];
        
        for (int i = 1; i<num; i++)
        {
            temp = Math.max(arr[i], arr[i]+temp);

            if (temp>max)
                max = temp;
        }

        System.out.println(max);

        sc.close();
    }

}
