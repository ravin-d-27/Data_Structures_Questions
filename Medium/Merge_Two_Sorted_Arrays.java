// We are given two sorted arrays. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array

// Examples: 

// Input: ar1[] = {10}, ar2[] = {2, 3}
// Output: ar1[] = {2}, ar2[] = {3, 10}  

// Input: ar1[] = {1, 5, 9, 10, 15, 20}, ar2[] = {2, 3, 8, 13}
// Output: ar1[] = {1, 2, 3, 5, 8, 9}, ar2[] = {10, 13, 15, 20}


import java.util.*;
public class Merge_Two_Sorted_Arrays
{
    static void display(int arr[])
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void merged(int arr1[], int arr2[])
    {
        int arr[] = new int[arr1.length+arr2.length];
        int k = arr1.length;
        for (int i = 0; i<arr1.length; i++)
        {
            arr[i] = arr1[i];
        }

        for (int i = 0; i<arr2.length; i++)
        {
            arr[k] = arr2[i];
            k++;
        }

        Arrays.sort(arr);
        
        for (int i = 0; i<arr1.length; i++)
        {
            arr1[i] = arr[i];
        }

        k = arr1.length;

        for (int i = 0; i<arr2.length; i++)
        {
            arr2[i] = arr[k];
            k++;
        }

        display(arr1);
        display(arr2);

    }

    public static void main(String args[])
    {
        Merge_Two_Sorted_Arrays obj = new Merge_Two_Sorted_Arrays();

        int ar1[] = {10}; 
        int ar2[] = {2, 3};

        obj.merged(ar1, ar2);
    }
}