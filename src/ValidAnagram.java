import java.util.*;

/**
 * Created by Shadowera on 2016/5/27.
 */
public class ValidAnagram {
    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            LinkedList<Character> list1 = new LinkedList<>();
            LinkedList<Character> list2 = new LinkedList<>();
            for (int i = 0; i < chars.length; i++) {
                list1.add(chars[i]);
                list2.add(chart[i]);
            }
            ListIterator<Character> iterator = list2.listIterator();
            while (iterator.hasNext()) {
                if (!list2.remove(list1.remove())) {
                    return false;
                }
            }
            return true;
        }
    }

    private static class Solution1 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chart);
            return Arrays.equals(chars, chart);
        }
    }

    private static class Solution2 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] counter = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counter[s.charAt(i) - 'a']++;
                counter[t.charAt(i) - 'a']--;
            }
            for (int count : counter) {
                if (count != 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
