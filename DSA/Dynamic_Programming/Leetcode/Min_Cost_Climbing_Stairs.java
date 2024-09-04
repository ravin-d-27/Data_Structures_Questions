import java.util.*;

public class Min_Cost_Climbing_Stairs {
    
    static int findingMinCost(ArrayList<Integer> arr)
    {
        int prev1 = arr.get(0);
        int prev2 = arr.get(1);
        int cost = Math.min(prev2, prev1);

        for (int i = 2; i < arr.size(); i++) {
            int currentCost = arr.get(i) + Math.min(prev1, prev2);
            prev1 = prev2;
            prev2 = currentCost;
            cost = Math.min(prev1, prev2);
        }

        return cost;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i<n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println(findingMinCost(arr));

        sc.close();
    }
}
