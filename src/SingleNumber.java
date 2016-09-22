/**
 * Created by Shadowera on 2016/5/20.
 */

import java.util.ArrayList;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] array2 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] array3 = new int[]{2, 2, 1};
        System.out.println(new Solution().singleNumber(array3));
    }

    private static class Solution1 {
        public int singleNumber(int[] nums) {
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (integers.contains(nums[i])) {
                    integers.remove(new Integer(nums[i]));
                    System.out.println("remove" + integers.toString());
                } else {
                    integers.add(nums[i]);
                    System.out.println("add" + integers.toString());
                }
            }
            System.out.println("length" + nums.length);
            return integers.remove(0);

        }
    }

    private static class Solution {

        public int singleNumber(int[] array) {
            int res = 0;
            for (int i = 0; i < array.length; i++) {
                res ^= array[i];
            }
            return res;
        }
    }
}
