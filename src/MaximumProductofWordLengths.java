/**
 * Created by Shadowera on 2016/6/2.
 */
public class MaximumProductofWordLengths {
    private static class Solution {
        public int maxProduct(String[] words) {
            int maxProduct = 0;
            int len = words.length;
            int[] mark = new int[len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    mark[i] |= 1 << (words[i].charAt(j) - 'a');
                }
                for (int j = 0; j < i; j++) {
                    if ((mark[i] & mark[j]) == 0) {
                        maxProduct=Math.max(maxProduct,words[i].length()*words[j].length());
                    }
                }

            }
            return maxProduct;
        }

    }
}
