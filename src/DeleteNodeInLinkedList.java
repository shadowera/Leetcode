/**
 * Created by Shadowera on 2016/5/26.
 */
public class DeleteNodeInLinkedList {
    public static void main(String[] args) {

    }

    private static class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}