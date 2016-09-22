import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Subscribe to see which companies asked this question
 */

/**
 * Created by Shadowera on 2016/4/28.
 */
public class ReverseVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("leetcode"));
    }

    private static class Solution {
        public String reverseVowels(String s) {
            HashSet<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');
            char[] array = s.toCharArray();
            ArrayList<Integer> index = new ArrayList<>();
            ArrayList<Character> allVowels = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (vowels.contains(array[i])) {
                    index.add(i);
                    allVowels.add(array[i]);
                }
            }
            Collections.reverse(allVowels);
            for (int j = 0; j < allVowels.size(); j++) {
                array[index.get(j)] = allVowels.get(j);
            }
            return new String(array);
        }
    }
}
