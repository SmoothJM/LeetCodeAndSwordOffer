package easy;

public class MiddleOfTheLinkedList_876 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode.show(head);
        System.out.println(middleNode(head).val);
        System.out.println("===");
        ListNode pre = new ListNode(1);
        pre.next=head;
        ListNode.show(pre);
        System.out.println(middleNode(pre).val);
    }

    public static ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
