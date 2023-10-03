/*
Problem Statement:

You are given a list of intervals, where each interval contains two values: start and end. Your goal is to merge overlapping intervals.

Write a function 'overlap' that takes a list of intervals 'inp' and returns a list of intervals after merging.

Function Signature: 
    public List<List<Integer>> overlap(List<List<Integer>> inp)

Input:
- A list of intervals 'inp', where each interval is represented as a list [start, end]. (1 <= start, end <= 10^9)
- The length of 'inp' will not exceed 10^4.

Output:
- A list of intervals after merging, where each interval is represented as a list [start, end].

Example:

Input:
inp = [[1,3],[2,4],[6,8],[9,10],[6,6]]

Output:
[[1,4],[6,8],[9,10]]

Explanation:
- The first interval [1,3] overlaps with the second interval [2,4], so they are merged into [1,4].
- The third interval [6,8] is kept as is, as it doesn't overlap with any other intervals.
- The fourth interval [9,10] doesn't overlap with any other intervals, so it is kept as is.
- The fifth interval [6,6] is a single point and doesn't overlap with any other intervals, so it is kept as is.

Note:
- Intervals are represented as lists of two integers, [start, end], where start and end are non-negative integers and start <= end.
- The given intervals may not be sorted.
- It is guaranteed that the intervals in the input list do not have any internal overlaps (i.e., they are non-overlapping within themselves).
*/



import java.util.*;

    public class Overlapping_Intervals {
        public List<List<Integer>> overlap(List<List<Integer>> inp)
        {
            Comparator<List<Integer>> customComparator = new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> list1, List<Integer> list2) {
                    int compareFirstElement = list1.get(0).compareTo(list2.get(0));
                    if (compareFirstElement != 0) {
                        return compareFirstElement;
                    } else {
                        return list1.get(1).compareTo(list2.get(1));
                    }
                }
            };

            Collections.sort(inp, customComparator);

            List<List<Integer>> result = new ArrayList<>();
            
            for (int i = 0; i<inp.size(); i++)
            {
                int start = inp.get(i).get(0);
                int end = inp.get(i).get(1);

                if (!result.isEmpty() && end <= result.get(result.size() - 1).get(1)) {
                    continue;
                }
                

                for (int j = i+1; j<inp.size(); j++)
                {
                    if (inp.get(j).get(0)<=end)
                    {
                        end = Math.max(end, inp.get(j).get(1));
                    }
                    else
                    {
                        break;
                    }
                        
                }

                result.add(Arrays.asList(start,end));
            }
            
            return result;
        }

        public static void main(String args[])
        {
            List<List<Integer>> qu = new ArrayList<>();
            qu.add(Arrays.asList(1,3));
            qu.add(Arrays.asList(2,4));
            qu.add(Arrays.asList(6,8));
            qu.add(Arrays.asList(9,10));
            qu.add(Arrays.asList(6,6));

            Overlapping_Intervals obj = new Overlapping_Intervals();
            List<List<Integer>> ans = obj.overlap(qu);
            for (int i = 0; i<ans.size(); i++)
            {
                System.out.println(ans.get(i));
            }

        }
        
    }
