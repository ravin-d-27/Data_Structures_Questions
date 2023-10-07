    /*
     * Given two sorted arrays, nums1 and nums2, find the median element.
     *
     * @param nums1 The first sorted array.
     * @param nums2 The second sorted array.
     * @return The median of the combined sorted arrays.
    */

import java.util.*;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double ans = 0.0;
        List <Integer> result = new ArrayList<>();
        
        for (int i: nums1)
            result.add(i);

        for (int i:nums2)
            result.add(i);

        Collections.sort(result);

        if (result.size()%2==0)
        {
            int x1 = result.get(result.size()/2-1);
            int x2 = result.get(result.size()/2);
            ans = (x1+x2)/2.0;
        }
        else
        {
            ans = result.get(result.size()/2);
        }

        return ans;
        
    }

    public static void main(String args[])
    {
        Median_of_Two_Sorted_Arrays obj = new Median_of_Two_Sorted_Arrays();
        int arr1[] = {1,3};
        int arr2[] = {2}; 
        System.out.println(obj.findMedianSortedArrays(arr1, arr2));
    }
    
}
