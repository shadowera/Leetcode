/**
 * Created by Shadowera on 2016/5/20.
 */

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Subscribe to see which companies asked this question
 */
public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    private static class Solution {
        public int maxDepth(TreeNode root) {
            return maxDepth(root,0);
        }

        private int maxDepth(TreeNode root, int i) {
            if(root==null) return i;
            return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        }


    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
