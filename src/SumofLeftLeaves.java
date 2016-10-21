/**
 * Created by shadowera on 9/26/16.
 */
public class SumofLeftLeaves {
    public static void main(String[] args) {

    }

    private class Solution {

        public int sumOfLeftLeaves(TreeNode root) {
            return root == null ? 0 : sumOfLeft(root.left, root.right, 0);
        }

        private int sumOfLeft(TreeNode left, TreeNode right, int sum) {
            if (left != null) {
                if (left.left == null && left.right == null)
                    sum += left.val;
                else
                    sum = sumOfLeft(left.left, left.right, sum);
            }
            if (right != null) {
                sum = sumOfLeft(right.left, right.right, sum);
            }
            return sum;
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
