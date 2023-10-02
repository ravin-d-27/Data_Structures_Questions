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
