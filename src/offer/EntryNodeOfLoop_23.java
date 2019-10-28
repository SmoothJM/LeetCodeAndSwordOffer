package offer;

public class EntryNodeOfLoop_23 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = b;
        System.out.println(EntryNodeOfLoop(head).value);
    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return pHead;
        ListNode first = pHead;
        ListNode second = pHead;
        ListNode meetNode = meetNode(pHead);
        if (meetNode == null) return null;
        int count = 1;
        pHead = meetNode.next;
        while(pHead!=meetNode){
            count++;
            pHead = pHead.next;
        }
        for (int i = 0; i < count; i++) {
            first = first.next;
        }
        while(first!=second){
            first=first.next;
            second=second.next;
        }

        return second;
    }

    public static ListNode meetNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        if (fast == null) return fast;

        while (slow != null && fast != null) {
            if (slow == fast) return slow;

            slow = slow.next;
            fast = fast.next;
            if (fast.next != null)
                fast = fast.next;
        }
        return null;
    }
}
