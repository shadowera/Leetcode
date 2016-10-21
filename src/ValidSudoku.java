import java.util.HashSet;

/**
 * Created by shadowera on 9/27/16.
 */
public class ValidSudoku {
    public static void main(String[] args) {

    }

    public static class Solution {

        public boolean isValidSudoku(char[][] board) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    //横向
                    char c = board[i][j];
                    if (c != '.') {
                        if (!row.contains(c)) {
                            row.add(c);
                        } else {
                            System.out.println("row:x=" + (i) + ",y=" + (j));
                            return false;
                        }
                    }
                    //纵向
                    char d = board[j][i];
                    if (d != '.') {
                        if (!column.contains(d)) {
                            column.add(d);
                        } else {
                            System.out.println("column:x=" + (j) + ",y=" + (i));
                            return false;
                        }
                    }
                    //九宫格
                    int x = (i % 3) * 3;
                    int y = i / 3 * 3;
                    int a = j / 3;
                    int b = j % 3;
                    char e = board[x + a][y + b];
                    if (e != '.') {
                        if (!set.contains(e)) {
                            set.add(e);
                        } else {
                            System.out.println("set:x=" + (x + a) + ",y=" + (y + b));
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
