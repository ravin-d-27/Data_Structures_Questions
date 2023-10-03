/*
Problem Statement:

You are given a rotated sorted array and a target value. You need to find the index of the target value in the array.

Write a program to find the index of the target value in the rotated sorted array.

Write a function 'rotateAndFind' that takes an integer array 'arr', an integer 'pivot' representing the index of the pivot element, and an integer 'target'. The function should return the index of the target value in the array. If the target value is not present, return -1.

Function Signature: 
    public static int rotateAndFind(int[] arr, int pivot, int target)

Input:
- An integer array 'arr' (1 <= |arr| <= 100) representing the elements of the array. The elements of 'arr' will be distinct integers in the range [-10^9, 10^9].
- An integer 'pivot' (0 <= pivot < |arr|) representing the index of the pivot element.
- An integer 'target' representing the value to be searched.

Output:
- An integer representing the index of the target value in the array. If the target value is not present, return -1.

Example:

Input:
arr = [4, 5, 6, 7, 0, 1, 2]
pivot = 3
target = 5

Output:
1

Explanation:
- The array is rotated at index 3. After rotation, the array becomes [4, 5, 6, 7, 0, 1, 2].
- The target value 5 is present at index 1.

Note:
- You may assume that there is always at least one element in the array.
*/


import java.util.Scanner;

public class search_in_rotated_sorted_array {

    static int rotate_and_find(int arr[], int pivot, int target)
    {
        boolean x = false;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]==target)
            {
                x = true;
                break;
            }
            else
            {
                x = false;
            }
        }

        if (x == true)
        {
            int new_arr[] = new int[arr.length];
            int k = 0;
        
            for (int i = pivot; i<arr.length; i++)
            {
                new_arr[k] = arr[i];
                k++;
            }

            for (int i = 0; i<pivot; i++)
            {
                new_arr[k] = arr[i];
                k++;
            }

            for (int i = 0; i<arr.length; i++)
            {
                if (new_arr[i] == target)
                {
                    return i;
                }
            }
            
        }

        return -1;
        
    }
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

        // Code starts
        // [0,1,2,4,5,6,7] : pivot 3 = [4,5,6,7,0,1,2]

    System.out.println("Enter the Pivot and Target Value: ");
    int pivot = sc.nextInt();
    int target = sc.nextInt();

    System.out.println("The Index of "+target+" is: "+rotate_and_find(arr, pivot, target));

        sc.close();
    }    
}
