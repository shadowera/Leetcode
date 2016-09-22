/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

/**
 * Created by Shadowera on 2016/4/29.
 */
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(38));
    }

    private static class Solution {
        public int addDigits(int num) {

            while (Math.abs(num) >= 10) {
                num = num % 10 + addDigits(num / 10);
            }

            return num;
        }

        public int _addDigits(int num) {

            if (num == 0)
                return 0;
            int i = num % 9;
            return i == 0 ? 9 : i;
        }
    }
}
