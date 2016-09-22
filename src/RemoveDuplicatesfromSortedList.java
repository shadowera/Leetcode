/**
 * Created by Shadowera on 2016/6/7.
 */
public class RemoveDuplicatesfromSortedList {
    private static void main(String[] args) {

    }

    private static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head.next;
            ListNode first = head;
            while (temp != null) {
                while (temp.val == first.val) {
                    temp = temp.next;
                    continue;
                }
                first.next = temp;
                temp = temp.next;
            }
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
