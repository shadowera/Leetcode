import java.util.ArrayList;
import java.util.List;

/**
 * Created by shadowera on 7/26/16.
 */
public class PascalTriangle {
    public static void main(String[] args){

    }
    private static class Solution {
        public List<List<Integer>> generate(int numRows) {
            ArrayList result = new ArrayList<>();
            for(int i=1;i<=numRows;i++){
                ArrayList<Integer> list = new ArrayList<>();
                result.add(list);
            }
            return result;
        }
    }
}
