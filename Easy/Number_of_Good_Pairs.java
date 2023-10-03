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
