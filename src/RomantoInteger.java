import java.util.HashMap;

/**
 * Created by Shadowera on 2016/6/2.
 */
public class RomantoInteger {
    private static class Solutoin {
        public int romanToInt(String s) {
            /*HashMap<Character, Integer> romanNum = new HashMap<>();
            romanNum.put('I', 1);
            romanNum.put('V', 5);
            romanNum.put('X', 10);
            romanNum.put('L', 50);
            romanNum.put('C', 100);
            romanNum.put('D', 500);
            romanNum.put('M', 1000);*/
            int[] vals = new int[26];
            vals['I'-'A'] = 1;
            vals['V'-'A'] = 5;
            vals['X'-'A'] = 10;
            vals['L'-'A'] = 50;
            vals['C'-'A'] = 100;
            vals['D'-'A'] = 500;
            vals['M'-'A'] = 1000;
            int before = Integer.MAX_VALUE;
            int result = 0;
            char[] str = s.toCharArray();
            for (int i = 0; i < str.length; i++) {
                int value = vals[str[i]-'A'];
                result += value;
                if (value > before) {
                    result -= 2 * before;
                }
                before = value;
            }
            return result;
        }
    }
}
