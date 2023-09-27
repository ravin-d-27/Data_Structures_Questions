// Solving using 2 Pointer Approach

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
