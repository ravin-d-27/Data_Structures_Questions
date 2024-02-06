package mypractice;

public class ShortestDistance {

    public static void main(String args[]) {

        ShortestDistance obj = new ShortestDistance();
        int arr[] = obj.findCoordinates("WNEENESENNN");
        System.out.println(obj.findDisplacement(arr));


    }

    public int[] findCoordinates(String directions)
    {
        int coordinates[] = new int[2];

        for (int i = 0; i<directions.length(); i++)
        {
            if (directions.charAt(i)=='N')
            {
                coordinates[1]+=1;
            }
            else if (directions.charAt(i)=='S')
            {
                coordinates[1]-=1;
            }
            else if (directions.charAt(i)=='E')
            {
                coordinates[0]+=1;
            }
            else if (directions.charAt(i)=='W')
            {
                coordinates[0]-=1;
            }
            else
            {
                coordinates[0]+=0;
            }
        }

        return coordinates;
    }

    public double findDisplacement(int arr[])
    {
        double temp = Math.pow(arr[0],2)+Math.pow(arr[1],2);
        double ans = Math.sqrt(temp);

        return ans;
    }
}
