import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shadowera on 2016/6/2.
 */
public class BinaryInoderTraversal {
    private static class Solutoin {
        private LinkedList<Integer> result = new LinkedList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            _inorderTraversal(root);
            return result;
        }

        private void _inorderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }
            _inorderTraversal(node.left);
            result.add(node.val);
            _inorderTraversal(node.right);
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
