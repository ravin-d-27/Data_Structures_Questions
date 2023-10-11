// Given an array of n elements that contains elements from 1 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.

// Note: The repeating element should be printed only once.

// Example: 

// Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
// Output: 1, 3, 6
// Explanation: The numbers 1 , 3 and 6 appears more than once in the array.


// Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
// Output: 3
// Explanation: The number 3 appears more than once in the array.


class Find_duplicates
{
    public void findDuplicates(int arr[]) {
        for (int i = 0; i<arr.length; i++)
        {
            int index = Math.abs(arr[i]);

            if (arr[index]>=0)
            {
                arr[index] = -arr[index];
            }
            else
            {
                System.out.println(index);
            }
        }
    }

    public static void main(String args[])
    {
        Find_duplicates obj = new Find_duplicates();
        int array[]={1, 2, 3, 4 ,3};
        obj.findDuplicates(array);
    }
}