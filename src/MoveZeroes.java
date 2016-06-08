/**
 * Created by Shadowera on 2016/5/24.
 */
public class MoveZeroes {
    public static void main(String[] args) {

    }

    private static class Solution {
        public void moveZeroes(int[] nums) {
            int position = 0;
            for (int i : nums) {
                if (i != 0) {
                    nums[position++] = i;
                }
            }
            for (int j = position; j < nums.length; j++) {
                nums[j] = 0;
            }
        }
    }
}
