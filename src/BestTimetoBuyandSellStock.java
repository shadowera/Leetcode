import java.util.ArrayList;

/**
 * Created by Shadowera on 2016/5/26.
 */
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

    }

    private static class Solution {
       /* private static final int HIGHPOINT = 1;
        private static final int LOWPOINT = -1;
        private static final int MIDDLE = 0;*/

        public int maxProfit(int[] prices) {
            /**
             * 下降-1，上升1,不变0
             */
            int position = 0;
            int profit = 0;
            boolean hasStock = false;
            if (prices.length <= 1) {
                return 0;
            }
            int state = prices[1] - prices[0];
            while (state == 0 && position < prices.length - 2) {
                position++;
                state = prices[position + 1] - prices[position];
            }
            if (state > 0) {
                profit -= prices[0];
                hasStock = true;
            }

            for (int i = position + 1; i < prices.length - 1; i++) {
                if (state > 0 && prices[i + 1] < prices[i]) {
                    if (hasStock) {
                        profit += prices[i];
                        hasStock = false;
                    }
                    state = -1;
                }
                if (state < 0 && prices[i + 1] > prices[i]) {
                    if (!hasStock) {

                        profit -= prices[i];
                        hasStock = true;
                    }
                    state = 1;
                }
            }
            if (hasStock)
                profit += prices[prices.length - 1];
            return Math.max(profit, 0);
        }
        private class Solution1{
            public int maxProfit(int[] prices) {

                int profit = 0;

                for(int i=1; i<prices.length; i++)
                    profit += ( prices[i]>prices[i-1] ? prices[i]-prices[i-1] : 0);

                return profit;
            }
        }

        /*private int sortPoint(int position, int[] prices) {
            if (position == 0) {
                if (prices[position + 1] > prices[position]) {
                    return -1;
                } else if (prices[position + 1] < prices[position]) {
                    return 1;
                } else {
                    return 0;
                }
            } else if (position == prices.length - 1) {
                if (prices[position - 1] > prices[position]) {
                    return -1;
                } else if (prices[position - 1] < prices[position]) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (prices[position] > prices[position + 1] && prices[position] > prices[position + 1]) {
                    return 1;
                } else if (prices[position] < prices[position + 1] && prices[position] < prices[position + 1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }*/
    }
}
