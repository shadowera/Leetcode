/**
 * Created by Shadowera on 2016/6/7.
 */
public class Numberof1Bits {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new Solution().hammingWeight(-1));
    }

    private static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int hammingWeight = 0;
            int cal = 0;
            for (int i = 0; i < 31; i++) {
                cal = (int) Math.pow(2, i);
                if ((n & cal) == cal) {
                    hammingWeight++;
                }
            }
            if (n < 0) {
                hammingWeight++;
            }
            return hammingWeight;
        }
    }

    private static class Solution1 {
        public int hammingWeight(int n) {
            int hammingWeight = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    hammingWeight++;
                }
                n = n >>> 1;
            }
            return hammingWeight;
        }
    }
}
