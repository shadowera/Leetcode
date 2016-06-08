import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Shadowera on 2016/5/24.
 */
public class IntersectionOfTwoArray {
    public static void main(String[] args) {

    }

    private static class Solution1 {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = Arrays
                    .stream(nums1)
                    .boxed()
                    .collect(Collectors.toSet());
            return Arrays
                    .stream(nums2)
                    .filter(set1::contains)
                    .distinct()
                    .toArray();
        }
    }

    private static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> list = new HashSet<>();
            for (Integer i : nums1) {
                set.add(i);
            }
            for (Integer j : nums2) {
                if (set.contains(j)) {
                    list.add(j);
                }
            }
            int[] array = new int[list.size()];
            int position = 0;
            for (Integer n : list) {
                array[position++] = n;
            }
            return array;
        }
    }
}
