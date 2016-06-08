/**
 * Created by Shadowera on 2016/5/27.
 */
public class Search2DMatrix {
    public class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int line = -1;
            for (int i = 0; i < matrix.length; i++) {
                if (target == matrix[i][0]) {
                    return true;
                } else if (target < matrix[i][0]) {
                    line = i - 1;
                    break;
                } else {
                    if (i == matrix.length - 1) {
                        if (target > matrix[i][(matrix[i].length - 1)]) {
                            return false;
                        } else {
                            line = i;
                        }
                    }
                }


            }

            if (line != -1) {
                for (int i = 0; i < matrix[line].length; i++) {
                    if (matrix[line][i] == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
