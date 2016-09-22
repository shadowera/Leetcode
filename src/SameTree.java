/**
 * Created by Shadowera on 2016/5/26.
 */
public class SameTree {
    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null) {
                return p == q;
            }
            return ((p.val == q.val) && (isSameTree(p.left, q.left)) && (isSameTree(q.right, p.right)));
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
