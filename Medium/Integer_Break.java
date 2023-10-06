/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2,
 * and maximize the product of those integers.
 *
 * Return the maximum product you can get.
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: 2 = 1 + 1, 1 × 1 = 1.
 *
 * Example 2:
 * Input: n = 10
 * Output: 36
 * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 */


public class Integer_Break
{
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n % 3 == 0) {
            int num = (int)Math.pow(3, n/3);
            return num;
        } else if (n % 3 == 1) {
            int num = (int)Math.pow(3, (n/3)-1) * 4;
            return num;
        } else {
            int num = (int)Math.pow(3, n/3) * 2;
            return num;
        }
    }
    public static void main(String args[])
    {
        Integer_Break obj = new Integer_Break();
        System.out.println(obj.integerBreak(10));
    }
}