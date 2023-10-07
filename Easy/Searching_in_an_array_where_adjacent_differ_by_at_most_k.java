    /*
     * Finds the index of a given element 'x' in the array 'arr' where adjacent elements differ by at most 'k'.
     *
     * @param arr An array of integers.
     * @param k The maximum allowed difference between adjacent elements.
     * @param x The element to be searched in the array.
     * @return The index of 'x' in 'arr', or -1 if 'x' is not found.
     */

public class Searching_in_an_array_where_adjacent_differ_by_at_most_k {

    public int findItOut(int arr[], int k, int x)
    {

        int i = 0;

        while (i<arr.length)
        {
            if (arr[i]==x)
            {
                return i;
            }

            i = i+Math.max(1, Math.abs(arr[i]-x)/k);
            
        }

        return -1;
    }

    public static void main(String args[])
    {
        Searching_in_an_array_where_adjacent_differ_by_at_most_k obj = new Searching_in_an_array_where_adjacent_differ_by_at_most_k();
        int arr[] = {2, 4, 5, 7, 7, 6};
        int x = 6;
        int k = 2;
        System.out.println(obj.findItOut(arr, k, x));
    }
    
}
