import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Shadowera on 2016/5/16.
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

    }

    public static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums1.length; i++) {
                list.add(nums1[i]);
            }
            for (int j = 0; j < nums2.length; j++) {
                list.add(nums2[j]);
            }
            Collections.sort(list);
            int middle = nums1.length + nums2.length / 2;
            if ((nums1.length + nums2.length) % 2 == 1) {
                return list.get(middle);
            } else {
                return (1.0 * list.get(middle - 1) + list.get(middle)) / 2;
            }
        }
    }
}
