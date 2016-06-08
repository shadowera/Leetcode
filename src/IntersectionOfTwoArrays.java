import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by Shadowera on 2016/5/30.
 */
public class IntersectionOfTwoArrays {
    private static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length < nums2.length) {
                int[] temp = nums1;
                nums1 = nums2;
                nums2 = temp;
            }
            ArrayList<Integer> result = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i : nums1) {
                list1.add(i);
            }
            for (int i : nums2) {
                list2.add(i);
            }
            ListIterator<Integer> iterator = list1.listIterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (list2.remove(next)) {
                    result.add(next);
                    iterator.remove();
                }
            }
            int[] resultArray = new int[result.size()];
            int position = 0;
            for (Integer i : result) {
                resultArray[position++] = i;
            }
            return resultArray;
        }
    }

    private static class Solution2 {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length == 0 || nums2.length == 0)
                return new int[0];
            if (nums1.length < nums2.length) {
                int[] temp = nums1;
                nums1 = nums2;
                nums2 = temp;
            }
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList<Integer> res = new ArrayList<>();
            int p1=0;
            int p2=0;
            while(p1<nums1.length && p2<nums2.length){
                if(nums1[p1]==nums2[p2]){
                    res.add(nums1[p1]);
                    p1++;
                    p2++;
                }
                else if(nums1[p1]<nums2[p2])
                    p1++;
                else
                    p2++;
            }
            int[] t=new int[res.size()];
            for(int i=0;i<res.size();i++)
                t[i]=res.get(i);

            return t;
        }
    }
}
