import java.util.*;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * <p>
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 * Created by Shadowera on 2016/4/29.
 */
public class CountingBits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.countBits(5)));
    }

    private static class Solution {
        public int[] countBits(int num) {
            int[] result = new int[num + 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = getBits(i);
            }
            return result;
        }

        /**
         * @param num
         * @return calculate the number of 1's  in the binary representation
         */
        public int getBits(int num) {
            int total = 0;
            int temp = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int result = num >> 1;
            list.add(num % 2);
            while (result > 0) {
                list.add(result % 2);
                result = result >> 1;

            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 1) {
                    total++;
                }
            }
            return total;
        }
    }

    public class Solution2{
        public int[] countBits(int num) {
            int[] bits = new int[num + 1];
            bits[0] = 0;
            int i, j;

            for (i = 1; i <= num; i++) {

                if (((i - 1) & 1) == 0) {
                    bits[i] = bits[i - 1] + 1;
                } else {
                    int combo = i ^ (i - 1);
                    combo = (combo + 1) >> 1;
                    int diff = (int) (Math.log(combo) / Math.log(2));

                    bits[i] = bits[i - 1] - diff + 1;
                }
            }

            return bits;
        }
    }
}
