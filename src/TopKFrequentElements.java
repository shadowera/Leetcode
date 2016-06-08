import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Shadowera on 2016/5/27.
 */
public class TopKFrequentElements {
    public static void main(String[] args) {

    }

    private static class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            ArrayList<Integer> result = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer integer = map.get(i);
                if (integer == null) {
                    map.put(i, 0);
                } else {
                    map.put(i, integer + 1);
                }
            }
            
            return result;
        }
    }
}
