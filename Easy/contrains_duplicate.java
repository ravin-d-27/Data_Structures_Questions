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
- You must not use any additional data structures to solve the problem.
- You may assume that there is always at least one element in the array.
*/



import java.util.Scanner;

public class contrains_duplicate {

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

        boolean v = false;
        
        for (int i = 0; i<arr.length; i++)
        {
            for (int j = i+1; j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    v = true;
                    break;
                }
            }

            if (v)
            {
                break;
            }
        }

        System.out.println(v);
                
        


        sc.close();
    }
    
}
