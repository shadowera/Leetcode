/**
 * Created by Shadowera on 2016/6/2.
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(786));
    }

    private static class Solution {
        public String intToRoman(int num) {
            if (num > 3999 || num <= 0) {
                return null;
            }
            char[] romanNum = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
            int bit = 0;
            int value = -1;
            StringBuilder stringBuilder = new StringBuilder();
            while (num > 0) {
                value++;
                bit = num % 10;
                num = num / 10;
                if (bit == 0) {
                    continue;
                }
                char roman1 = romanNum[2 * value];
                if (bit < 4) {
                    for (int i = bit; i > 0; i--) {
                        stringBuilder.append(roman1);
                    }
                    continue;
                }
                char roman5 = romanNum[2 * value + 1];
                if (bit == 4) {
                    stringBuilder.append(roman5).append(roman1);
                    continue;
                }
                if (bit < 9) {
                    for (int i = bit; i > 5; i--) {
                        stringBuilder.append(roman1);
                    }
                    stringBuilder.append(roman5);
                    continue;
                }
                char roman10 = romanNum[2 * value + 2];
                if (bit == 9) {
                    stringBuilder.append(roman10).append(roman1);
                }
            }
            return stringBuilder.reverse().toString();

        }
    }
}
