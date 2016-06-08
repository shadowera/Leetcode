import java.util.Arrays;

/**
 * Created by Shadowera on 2016/5/30.
 */
public class MissingNumber {
    private static class Solution {
        public int missingNumber(int[] nums) {
            int result = nums.length;
            for (int i = 0; i < nums.length; i++) {
                result ^= nums[i] ^ i;
            }
            return result;
        }
    }
}
