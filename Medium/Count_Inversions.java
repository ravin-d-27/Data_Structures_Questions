// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
// If an array is sorted in the reverse order then the inversion count is the maximum. 
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

// Example 1:

// Input: N = 5, arr[] = {2, 4, 1, 3, 5}
// Output: 3
// Explanation: The sequence 2, 4, 1, 3, 5 
// has three inversions (2, 1), (4, 1), (4, 3).
// Example 2:

// Input: N = 5
// arr[] = {2, 3, 4, 5, 6}
// Output: 0
// Explanation: As the sequence is already 
// sorted so there is no inversion count.
// Example 3:

// Input: N = 3, arr[] = {10, 10, 10}
// Output: 0
// Explanation: As all the elements of array 
// are same, so there is no inversion count.



public class Count_Inversions {
    
    public long inversionCount(long arr[], long N)
    {
        
        long count = 0;

        for (int i=0; i<N; i++)
        {
            int left = i;
            int right = i;

            while (left>=0 && right<N)
            {
                if (arr[left] >arr[right] && left<right)
                {
                    count++;
                }
                
                right++;
                left--;
            }

            left = i;
            right = i+1;
            
            while (left>=0 && right<N)
            {
                if (arr[left]>arr[right] && left<right)
                {
                    count++;
                }
                
                right++;
                left--;
            }
        }


        return count;
    }
    
}
