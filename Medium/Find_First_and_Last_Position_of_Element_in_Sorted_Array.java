// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public int[] searchRange(int nums[], int target)
    {
        int[] output = new int[2];

        int first = -1;
        int last = -1;

        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i]==target)
            {
                if (first==-1)
                {
                    first = i;
                }
                else
                {
                    last = i;
                }
            }
        }

        output[0] = first;
        output[1] = last;

        return output;
    }

    static void displ(int nums[])
    {
        for (int i = 0; i<nums.length; i++)
            System.out.println(nums[i]);
    }

    public static void main(String args[])
    {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array obj = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        displ(obj.searchRange(nums, target));
    }
    
}
