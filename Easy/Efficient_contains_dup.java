/*
Problem Statement:

You are given an array of integers. Your task is to determine whether the array contains any duplicate elements.

Write a program to find whether the given array contains any duplicate elements. If it contains duplicates, print "true"; otherwise, print "false".

Write a function 'containsDuplicate' that takes an integer array 'arr' and returns a boolean value indicating whether the array contains any duplicate elements.

Function Signature: 
    public static boolean containsDuplicate(int[] arr)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the elements of the array. The elements of 'arr' will be integers in the range [-10^9, 10^9].

Output:
- A boolean value. Return true if the array contains any duplicate elements, and false otherwise.

Example:

Input:
arr = [1, 2, 3, 4, 1]

Output:
true

Explanation:
The array contains the duplicate element '1'.

Note:
- You may use additional data structures to solve the problem.
- You may assume that there is always at least one element in the array.
*/



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Efficient_contains_dup {
    

    static boolean containsDuplicate(int[] nums) 
    {
        Set <Integer> n = new HashSet<Integer>();
        
        for (int num: nums)
        {
            if (n.contains(num))
            {
                return true;
            }

            n.add(num);
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the Elements: ");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Code Starts

        boolean v = containsDuplicate(arr);

        System.out.println(v);

        sc.close();
    }
    
}
