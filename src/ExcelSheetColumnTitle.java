/**
 * Created by shadowera on 7/26/16.
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(27));
    }

    private static class Solution {
        public String convertToTitle(int n) {
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                int j = n % 26;
                n = n / 26;
                sb.append((char) (j + 'A' - 1));
            }
            return sb.reverse().toString();
        }
    }
}
