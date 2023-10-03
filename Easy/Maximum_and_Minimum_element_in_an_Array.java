/*
Problem Statement:

You are given an array of integers. Your task is to find the maximum and minimum elements in the array.

Write a program to find the maximum and minimum elements in an array.

Write a function 'findMaxAndMin' that takes an integer array 'arr' and returns a string in the format "max_element min_element".

Function Signature: 
    public static String findMaxAndMin(int[] arr)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the elements of the array. The elements of 'arr' will be integers in the range [-10^9, 10^9].

Output:
- A string in the format "max_element min_element" representing the maximum and minimum elements in the array.

Example:

Input:
arr = [3, 4, 1, 9, 56, 7, 9, 12]

Output:
"56 1"

Explanation:
- The maximum element in the array is 56, and the minimum element is 1.

Note:
- You may assume that there is always at least one element in the array.
*/



import java.util.*;

public class Maximum_and_Minimum_element_in_an_Array
{
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
        int min = arr[0];
        for (int i = 1; i<num; i++)
        {
            if (max<arr[i])
                max = arr[i];
            if (min>arr[i])
                min = arr[i];
        }

        System.out.println("The Maximum Element is: "+max);
        System.out.println("The Minimum Element is: "+min);

        sc.close();
    }
}