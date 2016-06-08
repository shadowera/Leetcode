/**
 * Created by Shadowera on 2016/5/27.
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

    }

    private static class Solution {
        public int titleToNumber(String s) {
            int result = 0;
            char[] array = s.toCharArray();
            int length = array.length;
            for (int i = 0; i < length; i++) {
                result += (array[length - 1 - i] - 'A' + 1) * Math.pow(26, i);
            }
            return result;
        }
    }
}
