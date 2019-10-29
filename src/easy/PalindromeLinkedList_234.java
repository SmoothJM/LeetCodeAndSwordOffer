package easy;

public class PalindromeLinkedList_234 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode.show(head);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        // find the middle node of list
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        // reverse front half of list
        while(curr!=middle) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        if(fast!=null)
            slow = slow.next;
        while(pre!=null){
            if(slow.val!=pre.val) return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
