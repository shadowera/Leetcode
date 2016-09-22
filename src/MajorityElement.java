import java.util.HashMap;

/**
 * Created by Shadowera on 2016/5/30.
 */
public class MajorityElement {
    private static class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
            }
            for (Integer i : map.keySet()) {
                if (map.get(i) > nums.length / 2) {
                    return i;
                }
            }
            return Integer.MIN_VALUE;
        }
    }

    private static class Solution2 {
        public int majorityElement(int[] nums) {
            if (nums == null || nums.length == 0) {
                return Integer.MIN_VALUE;
            }
            int count = 1;
            int major = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != major) {
                    count--;
                } else {
                    count++;
                }
                if (count == 0) {
                    major = nums[i];
                    count = 1;
                }
            }
            return major;
        }
    }
}
