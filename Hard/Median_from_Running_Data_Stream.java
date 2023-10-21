// Find Median from Running Data Stream
// Difficulty Level : Hard
// Given that integers are read from a data stream. Find the median of elements read so far in an efficient way. 

// There are two cases for median on the basis of data set size.

// If the data set has an odd number then the middle one will be consider as median.
// If the data set has an even number then there is no distinct middle value and the median will be the arithmetic mean of the two middle values.
// Example:

// Input Data Stream: 5, 15, 1, 3
// Output: 5, 10,5, 4
// Explanation:
// After reading 1st element of stream – 5 -> median = 5
// After reading 2nd element of stream – 5, 15 -> median = (5+15)/2 = 10
// After reading 3rd element of stream – 5, 15, 1 -> median = 5
// After reading 4th element of stream – 5, 15, 1, 3 -> median = (3+5)/2 = 4

import java.util.*; 

public class Median_from_Running_Data_Stream {

    private double findMedian(List<Integer> ans)
    {
        double r = 0.0;
        Collections.sort(ans);

        if (ans.size()%2==0)
        {
            int x1 = ans.get(ans.size()/2-1);
            int x2 = ans.get(ans.size()/2);
            r = (x1+x2)/2.0;
        }
        else
        {
            r = ans.get(ans.size()/2);
        }

        return r;
    }

    public void printMedian(int dataStream[])
    {
        List <Integer> result = new ArrayList<>();
        double median = 0;

        for (int i = 0; i<dataStream.length; i++)
        {
            result.add(dataStream[i]);
            median = findMedian(result);
            System.out.println(median);
        }
    }

    public static void main(String args[])
    {
        Median_from_Running_Data_Stream obj = new Median_from_Running_Data_Stream();
        int dataStream[]= {5, 15, 1, 3};
        obj.printMedian(dataStream);
    }
    
}
