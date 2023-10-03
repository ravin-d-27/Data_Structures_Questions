/*
Problem Statement:

Given an array of integers 'nums', a pair (i,j) is called good if nums[i] == nums[j] and i < j.

Write a program to count the number of good pairs in the array.

Write a function 'numIdenticalPairs' that takes an integer array 'nums' and returns the number of good pairs.

Function Signature: 
    public int numIdenticalPairs(int[] nums)

Input:
- An integer array 'nums' (1 <= |nums| <= 100) representing the elements of the array. The elements of 'nums' will be integers in the range [-100, 100].

Output:
- An integer representing the number of good pairs.

Example:

Input:
nums = [1, 2, 3, 1, 1, 3]

Output:
4

Explanation:
- There are 4 good pairs in the array: (0,3), (0,4), (3,4), (2,5).

Note:
- You may assume that there is always at least one element in the array.
*/


public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;

        for (int i = 0; i<nums.length; i++)
        {
            for (int j = i+1; j<nums.length; j++)
            {
                if (nums[i]==nums[j] && i<j)
                {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String args[])
    {
        int arr[] = {1,1,1,1};
        Number_of_Good_Pairs obj = new Number_of_Good_Pairs();
        System.out.println(obj.numIdenticalPairs(arr));
    }
}
