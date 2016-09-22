import java.util.HashSet;

/**
 * Created by Shadowera on 2016/5/30.
 */
public class ContainDuplicate {
    private static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }
            return !(set.size() == nums.length);
        }
    }
}
