import java.util.Arrays;

public class kth_largest_number {

    static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }

    public static void main(String args[])
    {

        int arr[] = {7,6,4,3,1};
        System.out.println(findKthLargest(arr, 2));    
    
    }
    
}
