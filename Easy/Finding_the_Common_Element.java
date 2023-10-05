import java.util.*;
public class Finding_the_Common_Element {

    public List<Integer> findCommon(int arr1[], int arr2[], int arr3[])
    {
        List<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> temp = new HashMap<>();

        for (int num: arr1)
        {
            if (temp.containsKey(num))
            {
                temp.put(num, temp.get(num)+1);
            }
            else
            {
                temp.put(num,1);
            }
        }
        
        for (int num: arr2)
        {
            if (temp.containsKey(num))
            {
                temp.put(num, temp.get(num)+1);
            }
            else
            {
                temp.put(num,1);
            }
        }
        

        for (int num: arr3)
        {
            if (temp.containsKey(num))
            {
                temp.put(num, temp.get(num)+1);
            }
            else
            {
                temp.put(num,1);
            }
        }

        for (int key: temp.keySet())
        {
            if (temp.get(key)==3)
            {
                output.add(key);
            }
        }
        
        return output;
    }

    public static void main(String args[])
    {
        Finding_the_Common_Element obj = new Finding_the_Common_Element();
        int ar1[] = {1, 5, 10, 20, 40, 80} ;
        int ar2[] = {6, 7, 20, 80, 100} ;
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} ;
        System.out.println(obj.findCommon(ar1, ar2, ar3));
    }
    
}
