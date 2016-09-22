import java.util.ArrayList;

/**
 * Created by Shadowera on 2016/5/24.
 */
public class SingleNumber3 {
    public static void main(String[] args) {

    }

    private static class Solution {
        public int[] singleNumber(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : nums) {
                if (list.contains(i)) {
                    list.remove(new Integer(i));
                } else {
                    list.add(i);
                }
            }
            int[] array = new int[list.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }
}
