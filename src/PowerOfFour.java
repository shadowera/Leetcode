/**
 * Created by Shadowera on 2016/4/28.
 */

import static java.lang.Math.log;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 */
public class PowerOfFour {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(16));

    }

    private static class Solution1 {
        public boolean isPowerOfFour(int num) {
            return (log(num) / log(4)) % 1 == 0;
        }
    }

    private static class Solution {
        public boolean isPowerOfFour(int num) {
            if (num == 0) return false;
            if (num == 1) return true;
            int n = 4;
            int quotient = num / n;
            int mod = num % n;
            if (mod != 0)
                return false;
            return isPowerOfFour(quotient);
        }
    }
}
