// Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// Examples : 

//     Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
//     Output : 4
//     Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

//     Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
//     Output : No Majority Element
//     Explanation: There is no element whose frequency is greater than the half of the size of the array size.

import java.util.*;
public class Majority_Element {

    public int majorityElement(int arr[])
    {
        int maj = 0;
        int req = arr.length/2;

        int max = 0;
        HashMap <Integer, Integer> temp = new HashMap<>();

        for (int i : arr)
        {
            if (temp.containsKey(i))
            {
                temp.put(i, temp.get(i)+1);
            }
            else
            {
                temp.put(i, 1);
            }

            if (temp.get(i)>max)
            {
                max = temp.get(i);
                maj = i;
            }
        }
        
        if (max > req)
        {
            return maj;
        }
        else
        {
            return -1;
        }

    }

    public static void main(String args[])
    {
        Majority_Element obj = new Majority_Element();
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(obj.majorityElement(arr));
    }
    
}
