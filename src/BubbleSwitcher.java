/**
 * Created by Shadowera on 2016/5/30.
 */
public class BubbleSwitcher {
    private static class Solution {
        public int bulbSwitch(int n) {
            if (n <= 0) return 0;
            return (int) Math.sqrt(n);
        }
    }
}
