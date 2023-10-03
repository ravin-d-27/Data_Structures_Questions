// Solving using 2 Pointer Approach

/*
Problem Statement:

Given an array 'nums' of 'n' integers, are there elements a, b, c in 'nums' such that a + b + c = target? Find all unique triplets in the array which gives the sum of 'target'.

Write a function 'threeSum' that takes an integer array 'nums' and an integer 'target' and returns a list of lists containing all unique triplets that add up to the target.

Function Signature: 
    public List<List<Integer>> threeSum(int nums[], int target)

Input:
- An integer array 'nums' (3 <= nums.length <= 10^3) where each element 'nums[i]' (-10^3 <= nums[i] <= 10^3) represents an element of the array.
- An integer 'target' (-10^3 <= target <= 10^3) represents the target sum.

Output:
- A list of lists containing all unique triplets that add up to the target sum. Each triplet should be represented as a list of three integers.

Example:

Input:
nums = [1,5,3,2,7,1,4], target = 10

Output:
[[1, 2, 7], [1, 3, 6], [1, 4, 5], [2, 3, 5]]

Explanation:
In this case, the unique triplets that add up to the target sum 10 are [1, 2, 7], [1, 3, 6], [1, 4, 5], and [2, 3, 5].

Note:
- The solution set must not contain duplicate triplets.
- Triplet elements must be in non-descending order.
*/


import java.util.*;
public class Three_Sum {

    public List<List<Integer>> threeSum(int nums[], int t)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i<nums.length-2; i++)
        {
            if (i>0 && nums[i-1]==nums[i]) // This is to avoid the processing of duplicate elements
                continue;
            
            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i] + t;
            
            while (left<right)
            {
                int sum = nums[left]+nums[right];
                if (sum == target)
                {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left<right && nums[left-1]==nums[left])
                        left++;
                    while(left<right && nums[right+1]==nums[right])
                    {
                        right--;
                    }
                }
                else if (sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
            
        }

        return result;
    }

    public static void main(String args[])
    {
        int nums[] = {1,5,3,2,7,1,4};
        int target = 10;

        Three_Sum obj = new Three_Sum();
        List<List<Integer>> ans = obj.threeSum(nums,target);

        for (int i = 0; i<ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }

    }
    
}
