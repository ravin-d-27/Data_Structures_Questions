/*
Problem Statement:

You are given an array of integers. Your task is to reverse the elements of the array.

Write a program to reverse the elements of the given array.

Write a function 'reverseArray' that takes an integer array 'arr' and returns an array with the elements reversed.

Function Signature: 
    public static int[] reverseArray(int[] arr)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the elements of the array. The elements of 'arr' will be integers in the range [-10^9, 10^9].

Output:
- An integer array with the elements reversed.

Example:

Input:
arr = [1, 2, 3, 4, 5]

Output:
[5, 4, 3, 2, 1]

Note:
- You may assume that there is always at least one element in the array.
*/


import java.util.*;

public class Reversing_an_Array {
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

        for (int i = num-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
