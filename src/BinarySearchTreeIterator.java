import java.util.LinkedList;

/**
 * Created by shadowera on 10/11/16.
 */
public class BinarySearchTreeIterator {


    public static void main(String[] args) {

    }

    private static class BSTIterator {
        private LinkedList<TreeNode> list;

        public BSTIterator(TreeNode root) {
            list = new LinkedList<TreeNode>();
            if (root != null) {
                list.add(root);
            }
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return list.size() > 0;
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode node = list.removeFirst();
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
            return 0;
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
