/**
 * Created by Shadowera on 2016/5/27.
 */
public class RemoveNthNodeFromEnd {
    public static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = head;
            ListNode remove = head;
            for (int i = 0; i < n; i++) {
                if ((temp = temp.next) == null) {
                    return head.next;
                }
            }
            while ((temp = temp.next) != null) {
                remove = remove.next;
            }
            remove.next = remove.next.next;
            return head;
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
