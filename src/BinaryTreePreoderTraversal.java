import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shadowera on 2016/6/2.
 */
public class BinaryTreePreoderTraversal {
    private static class Solution {
        private LinkedList<Integer> list = new LinkedList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            preoderTraversal(root);
            return list;
        }

        private void preoderTraversal(TreeNode root) {
            if (root==null){
                return;
            }
            list.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
            }
            if (root.right != null) {
                preorderTraversal(root.right);
            }
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
