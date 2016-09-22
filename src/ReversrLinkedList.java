/**
 * Created by Shadowera on 2016/6/2.
 */
public class ReversrLinkedList {
    private static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static class Solution2 {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode pre = null;
            ListNode nex = null;
            while (head != null) {
                nex = head.next;
                head.next = pre;
                pre = head;
                head = nex;
            }
            return pre;
        }
    }
}
