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
