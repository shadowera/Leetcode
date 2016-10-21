
import java.util.HashMap;

/**
 * Created by shadowera on 9/22/16.
 */
public class FractiontoRecurringDecimal {
    public static void main(String[] args) {
        System.out.println(new Solution().fractionToDecimal(1, 5));
    }

    private static class Solution {
        public String fractionToDecimal(int numerator, int denominator) {
            StringBuilder result = new StringBuilder();
            String sign = numerator > 0 == denominator > 0 || numerator == 0 ? "" : "-";
            result.append(sign);
            //abs 的坑 ..= =..
            long num = Math.abs((long)numerator);
            long den = Math.abs((long)denominator);
            long i = num / den;
            result.append(i);
            long remain = num % den;
            if (remain == 0) {
                return result.toString();
            }
            result.append(".");
            HashMap<Long, Integer> map = new HashMap<>();
            while (!map.containsKey(remain)) {
                map.put(remain, result.length());
                result.append(remain * 10 / den);
                remain = remain * 10 % den;
            }
            Integer index = map.get(remain);
            result.insert(index, "(");
            result.append(")");
            return result.toString().replace("(0)", "");
        }
    }
}
