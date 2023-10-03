/*
Problem Statement:

You are given an array 'arr' where arr[i] is the price of a given stock on the i-th day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Write a function 'find' that takes an integer array 'arr' and returns the maximum profit that can be achieved.

Function Signature: 
    static int find(int arr[])

Input:
- An array 'arr' of integers (0 <= arr[i] <= 10000), where arr[i] represents the price of the stock on the i-th day. The length of the array will not exceed 10^5.

Output:
- An integer representing the maximum profit that can be achieved. If no profit can be achieved, return 0.

Example:

Input:
arr = [7, 6, 4, 3, 1]

Output:
0

Explanation:
In this case, it's not possible to make any profit as the stock prices are continuously decreasing.

Note:
- You can only make one transaction (buy one and sell one stock).
- If there is no way to make a profit, return 0.
*/


public class Best_Time_for_Stocks {

    static int find(int arr[])
    {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
            else
            {
                max = Math.max(max, arr[i]-min);
            }
        }

        return max;
        
    }
    public static void main(String args[])
    {
        int arr[] = {7,6,4,3,1};

        System.out.println(find(arr));
        
    }
    
}
