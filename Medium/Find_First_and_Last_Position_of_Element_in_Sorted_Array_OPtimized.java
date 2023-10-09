// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].


public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_OPtimized {

    public static void main(String args[])
    {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array_OPtimized obj = new Find_First_and_Last_Position_of_Element_in_Sorted_Array_OPtimized();
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        displ(obj.findOptimized(nums, target));
    }

    static void displ(int nums[])
    {
        for (int i = 0; i<nums.length; i++)
            System.out.println(nums[i]);
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

    
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }

        return -1;
    }

    public int[] findOptimized(int nums[], int target)
    {
        int output[]= new int[2];
        output[0] = -1;
        output[1] = -1;

        output[0] = binarySearch(nums, target)-1;

        if (output[0] != -1) {
            // Find the last occurrence of the target
            int rightIndex = output[0];
            while (rightIndex < nums.length && nums[rightIndex] == target) {
                rightIndex++;
            }
            output[1] = rightIndex - 1;
        }

        return output;

        

        
    }
    
}
