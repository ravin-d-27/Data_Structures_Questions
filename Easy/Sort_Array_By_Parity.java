/*
Problem Statement:

You are given an array of integers. Your task is to sort the elements in such a way that all even numbers appear before odd numbers.

Write a program to sort the array such that all even elements precede all odd elements.

Write a function 'sortArrayByParity' that takes an integer array 'nums' and returns a sorted array.

Function Signature: 
    public int[] sortArrayByParity(int[] nums)

Input:
- An integer array 'nums' (1 <= |nums| <= 100) representing the elements of the array. The elements of 'nums' will be distinct integers in the range [-10^9, 10^9].

Output:
- An integer array with even elements appearing before odd elements.

Example:

Input:
nums = [3, 1, 2, 4]

Output:
[2, 4, 3, 1]

Explanation:
- After sorting, all even elements (2 and 4) appear before odd elements (3 and 1).

Note:
- You may assume that there is always at least one element in the array.
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        
        List <Integer> odd = new ArrayList <> ();
        List <Integer> even = new ArrayList <> ();

        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        even.addAll(odd);

        int[] ans = new int[nums.length];
        for (int i = 0; i<nums.length; i++)
        {
            ans[i] = even.get(i);
        }
    
        return ans;
    }  
}
