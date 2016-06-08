/**
 * Created by Shadowera on 2016/6/7.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(536870912));
    }

    private static class Solution {
        public boolean isPowerOfTwo(int n) {
            System.out.println(Math.log(n) / Math.log(2));
            return (Math.log(n) / Math.log(2) % 1 - 0) < 0.00000001;
        }
    }

    private static class SOlution1 {
        public boolean isPowerOfTwo(int n) {
            return false;
        }
    }
}
