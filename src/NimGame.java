/**
 * Created by Shadowera on 2016/4/29.
 */
public class NimGame {
    public static void main(String[] args){
        System.out.println(new Solution().canWinNim(4));
    }
    private static class Solution {
        public boolean canWinNim(int n) {
            return !(n % 4 == 0);
        }
    }
}
