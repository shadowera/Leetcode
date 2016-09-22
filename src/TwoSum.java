import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Shadowera on 2016/5/16.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(array, 9)));
    }

    private static class Solution {
        public int[] twoSum(int[] nums, int target) {
            long start = System.currentTimeMillis();
            /*if (nums.length <= 2) {
                return null;
            }
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            } solution1*/
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    res[0] = i;
                    res[1] = map.get(target - nums[i]);
                    long end = System.currentTimeMillis();
                    System.out.println(end - start);
                    return res;
                }
                map.put(nums[i], i);
            }

            long end = System.currentTimeMillis();
            System.out.println(end - start);
            return null;
        }
    }

    private static class Solution2 {
        public int[] twoSum(int[] nums, int target) {

            return null;
        }
    }
}
