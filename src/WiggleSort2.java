import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 * Example:
 * (1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
 * (2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].
 * Note:
 * You may assume all input has valid answer.
 * Follow Up:
 * Can you do it in O(n) time and/or in-place with O(1) extra space?
 * Credits:
 * Special thanks to @dietpepsi for adding this problem and creating all test cases.
 * Created by Shadowera on 2016/1/9.
 */
public class WiggleSort2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 5, 1, 1, 6, 4};
        Solution.wiggleSort(nums1);
        for (int i : nums1) {
            System.out.print(i+",");
        }
        System.out.println();
        int[] nums2 = new int[]{1, 3, 2, 2, 3, 1};
        Solution.wiggleSort(nums2);
        for (int i : nums2) {
            System.out.print(i+",");
        }
    }

    public static class Solution {
        public static void wiggleSort(int[] nums) {
            int[] Array = new int[nums.length];
            Arrays.sort(nums);
            int i = 0;
            for (i = 0; i < nums.length; i++) {
                if (i < (nums.length+1) / 2)
                    Array[2 * i] = nums[i];
                else
                    Array[2 * (i - (nums.length+1) / 2) + 1] = nums[i];
            }
            for (i = 0; i < nums.length; i++) {
                nums[i] = Array[i];
            }
        }
    }
}
