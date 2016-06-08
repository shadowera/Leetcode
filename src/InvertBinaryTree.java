/**
 * Created by Shadowera on 2016/5/20.
 */
public class InvertBinaryTree {
    public static void main(String[] args) {

    }

    private static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.right = left;
            root.left = right;
            if (left != null) {
                invertTree(left);
            }
            if (right != null) {
                invertTree(right);
            }

            return root;
        }


        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                val = x;
            }
        }
    }
}
