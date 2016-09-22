/**
 * Created by Shadowera on 2016/6/6.
 */
public class OddEvenLinkedList {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        ListNode listNode = new ListNode(array);
        listNode = new Solutoin().oddEvenList(listNode);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    private static class Solutoin {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null || head.next.next == null) {
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenFirst = head.next;
            while (odd.next != null && odd.next.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenFirst;
            return head;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("array can't be null");
            }
            this.val = array[0];
            ListNode temp = this;
            for (int i = 1; i < array.length; i++) {
                temp.next = new ListNode(array[i]);
                temp = temp.next;
            }
        }

        ListNode(int x) {
            val = x;
        }
    }
}
