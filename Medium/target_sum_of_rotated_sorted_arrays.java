class target_sum_of_rotated_sorted_arrays
{

    static boolean find_sum(int arr[], int target)
    {
        int pivot = 0;

        for (pivot = 0; pivot < arr.length-1; pivot++)
        {
            if (arr[pivot]>arr[pivot+1])
            {
                break;
            }
        }

        int l = (pivot+1)%arr.length;
        int r = pivot;

        

        while (l!=r)
        {
    
            if (arr[l]+arr[r]==target)
                return true;
            
            if (arr[l]+arr[r]<target)
                l = (l+1)%arr.length;
            else
                r = (arr.length+r-1)%arr.length;
        
        }
        return false;

    }
    public static void main(String args[])
    {
        int arr[] = {5,8,11,3,7};
        int target = 13;

        System.out.println(find_sum(arr, target));
    }
}