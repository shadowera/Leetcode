/**
 * Created by Shadowera on 2016/5/13.
 */

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * Credits:
 * Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
 * <p>
 * Subscribe to see which companies asked this question
 */
public class HouseRobber {
    public static void main(String[] args) {

    }

    public static class Solution {
        public int rob(int[] nums) {
            if (nums.length < 1) {
                return 0;
            }
            if (nums.length < 2) {
                return nums[0];
            }
            int[] numSum = new int[nums.length];
            for (int i : numSum) {
                if (i < numSum.length - 3) {
                }
            }
            return 0;
        }
    }
}
