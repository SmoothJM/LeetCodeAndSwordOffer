package offer;

import java.util.ArrayList;

public class MiddleNodeOfList_22_2 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode.show(head);
        int k = 8;
        System.out.println(FindMiddle(head).value);
    }

    public static ListNode FindMiddle(ListNode head) {
        if (head == null) return head;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
