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
