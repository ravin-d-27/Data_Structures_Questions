/*
Problem Statement:

Alex loves chocolate. He has 'n' boxes of chocolate, and each box has a certain number of chocolates. The 'i-th' box contains 'arr[i]' chocolates.

Alex wants to distribute the chocolates equally among his 'm' friends. For that, he wants to choose a continuous subarray of boxes whose total number of chocolates is divisible by 'm'.

Write a program to find the minimum difference between the number of chocolates in the largest and the smallest box of the chosen subarray.

Write a function 'findMinDifference' that takes an integer array 'arr' representing the number of chocolates in each box, an integer 'n' representing the number of boxes, and an integer 'm' representing the number of friends. The function should return the minimum difference between the number of chocolates in the largest and the smallest box of the chosen subarray.

Function Signature: 
    public static int findMinDifference(int[] arr, int n, int m)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the number of chocolates in each box. The elements of 'arr' will be integers in the range [1, 10^5].
- An integer 'n' (1 <= n <= 100) representing the number of boxes.
- An integer 'm' (1 <= m <= n) representing the number of friends.

Output:
- An integer representing the minimum difference between the number of chocolates in the largest and the smallest box of the chosen subarray.

Example:

Input:
arr = [3, 4, 1, 9, 56, 7, 9, 12], n = 8, m = 5

Output:
6

Explanation:
- The subarray [3, 4, 1, 9, 56] has the minimum difference between the largest and smallest chocolates, which is |56-1| = 55.

Note:
- It is guaranteed that there will always be a valid subarray that satisfies the condition.
- You may assume that 'm' is always a valid number, 1 ≤ m ≤ n.
*/



import java.util.Scanner;
import java.util.Arrays;

public class Chocolate_Box_Problem {
    
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

        // Code Starts

        Arrays.sort(arr);
        
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
       

        int globalmin = Integer.MAX_VALUE;
        for (int i = 0; i+m-1<arr.length; i++)
        {
            int temp = arr[i+m-1]-arr[i];
            globalmin = Math.min(globalmin, temp);

        }

        System.out.println("The Minimum Difference is: "+globalmin);

        sc.close();
    }
}
