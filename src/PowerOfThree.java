import static java.lang.Math.log;
import static java.lang.Math.log10;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * Created by Shadowera on 2016/1/9.
 */
public class PowerOfThree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.isPowerOfThree(81));
    }

    static class Solution {
        public static boolean isPowerOfThree(int n) {
            return (log(n) / log(3)) % 1 == 0;
        }
    }
}
