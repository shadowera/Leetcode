import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by shadowera on 9/26/16.
 */
public class SerializeandDeserializeBinaryTree {
    public static void main(String[] args) {
        Codex codex = new Codex();
        int[] ints = {1, 2, 3, 4, 5, 6};
        String s = Arrays.toString(ints);
        System.out.println(s);
        System.out.println(s.trim().substring(1, s.length() - 1));
    }

    private static class Codex {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);

            while(!queue.isEmpty()){
                TreeNode top = queue.poll();
                if(top == null){
                    sb.append("#,");
                }
                else{
                    sb.append(top.val + ",");
                    queue.add(top.left);
                    queue.add(top.right);
                }
            }

            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.isEmpty() || data.charAt(0) == '#'){
                return null;
            }

            String[] arr = data.split(",");
            int idx = 0;

            TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);

            while(!queue.isEmpty()){
                TreeNode top = queue.poll();
                if(top == null){
                    continue;
                }
                top.left = arr[++idx].equals("#") ? null : new TreeNode(Integer.valueOf(arr[idx]));
                top.right = arr[++idx].equals("#") ? null : new TreeNode(Integer.valueOf(arr[idx]));
                queue.add(top.left);
                queue.add(top.right);
            }

            return root;
        }
    }

    //Definition for a binary tree node.
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
