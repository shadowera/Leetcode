/**
 * Created by Shadowera on 2016/4/28.
 */

/**
 * Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.
 * <p>
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * <p>
 * Note: you may assume that n is not less than 2.
 * <p>
 * Show Hint
 * Credits:
 * Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 * <p>
 * Subscribe to see which companies asked this question
 */
public class IntegerBreak {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(10));
    }

    private static class Solution {
        public int integerBreak(int n) {
            if (n <= 3) {
                return n - 1;
            }
            int mod = n % 3;
            int twos = 0;
            int threes = 0;
            switch (mod) {
                case 0:
                    threes = n / 3;
                    break;
                case 1:
                    threes = n / 3 - 1;
                    twos = 2;
                    break;
                case 2:
                    threes = n / 3;
                    twos = 1;
                    break;
                default:
                    break;
            }
            return (int) (Math.pow(2, twos) * Math.pow(3, threes));
        }
    }
}
