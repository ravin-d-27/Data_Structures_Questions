/*
    Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]

Example 2:

Input: nums = [1]
Output: [1]

Example 3:

Input: nums = [1,2]
Output: [1,2]

 

Constraints:

    1 <= nums.length <= 5 * 104
    -109 <= nums[i] <= 109

 */

import java.util.*;
 class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> output = new ArrayList<>();
        HashMap <Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i<nums.length; i++)
        {
            if(temp.containsKey(nums[i]))
            {
                temp.put(nums[i],temp.get(nums[i])+1);
            }
            else
            {
                temp.put(nums[i],1);
            }
        }

        for (int i: temp.keySet())
        {
            if (temp.get(i)>(nums.length/3))
            {
                output.add(i);
            }
        }

        return output;
        
    }
}