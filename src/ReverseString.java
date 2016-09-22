/**
 * Created by Shadowera on 2016/4/28.
 */
public class ReverseString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseString("leetcode"));
    }

    private static class Solution {
        public String reverseString(String s) {
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length / 2; i++) {
                char temp = 0;
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return new String(array);
        }
    }
}
