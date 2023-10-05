/*
 * Problem Statement:
 Implement the Counting Sort algorithm to sort an array of integers in ascending order.
  
Counting Sort Algorithm Steps:
1. Find the maximum element in the input array.
2. Initialize an array to store the frequency of each element, with size max+1.
3. Store the frequency of each element in the frequency array.
4. Find the cumulative sum of the frequencies in the frequency array.
5. Define an output array with the same size as the input array.  Update the output array using the cumulative sum and input array.
6. The output array now contains the sorted elements.
 
 */

public class Counting_Sort
{
    public void countingSort(int[] arr)
    {
        // Step 1: Finding the maximum element

        int max = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
        }

        // Step 2: Initialize an array with size max+1
        int countArray[] = new int[max+1];
        for (int i = 0; i<countArray.length; i++)
        {
            countArray[i] =  0;
        }

        // Step 3: Store the frequency of elements in that array

        for (int i = 0; i<arr.length; i++)
        {
            countArray[arr[i]]++;
        }

        // Step 4: Finding the Cumulative Sum

        for (int i = 1; i<countArray.length; i++)
        {
            countArray[i] = countArray[i-1]+countArray[i];
        }
        
        // Step 5: Define output array of size of input array and update it

        int output[] = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--)
        {
            output[countArray[arr[i]]-1] = arr[i];
            countArray[arr[i]]--;
        }

        for (int i = 0; i<output.length; i++)
        {
            System.out.println(output[i]);
        }

        
    }

    public static void main(String args[])
    {
        Counting_Sort obj = new Counting_Sort();
        int arr[] = {2,5,3,0,2,3,0,3};
        obj.countingSort(arr);
    }
}