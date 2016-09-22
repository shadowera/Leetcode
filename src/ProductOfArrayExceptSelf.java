/**
 * Created by Shadowera on 2016/5/26.
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    private static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            int product = 1;
            int zeroes = 0;
            int firstZeroPosition = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroes++;
                    firstZeroPosition = i;
                    if (zeroes >= 2) {
                        return result;
                    }
                } else {
                    product *= nums[i];
                }
            }
            if (zeroes == 1) {
                result[firstZeroPosition] = product;
                return result;
            }
            for (int i = 0; i < result.length; i++) {
                result[i] = product / nums[i];
            }
            return result;
        }
    }
}
