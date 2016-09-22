/**
 * Created by Shadowera on 2016/6/7.
 */
public class MergekSortedLists {
    private static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            ListNode result = lists[0];
            for (int i = 1; i < lists.length; i++) {
                result = merge2LinkedList(result, lists[i]);
            }
            return result;
        }

        public static ListNode merge2LinkedList(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode head = null;
            if (l1.val > l2.val) {
                head = l2;
                l2 = l2.next;
            } else {
                head = l1;
                l1 = l1.next;
            }
            ListNode temp = head;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    temp.next = l1;
                    temp = temp.next;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    temp = temp.next;
                    l2 = l2.next;
                }
            }
            while (l1 != null) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            while (l2 != null) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
