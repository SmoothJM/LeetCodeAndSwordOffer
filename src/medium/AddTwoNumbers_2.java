package medium;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(9);
        ListNode a1 = new ListNode(9);
        ListNode b1 = new ListNode(9);

        ListNode h2 = new ListNode(1);
        ListNode a2 = new ListNode(6);
        ListNode b2 = new ListNode(4);

        h1.next = a1;
        a1.next = b1;
//        h2.next = a2;
//        a2.next = b2;
        ListNode.show(addTwoNumbers(h1, h2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return l1;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int a = l1.val;
        int b = l2.val;
        ListNode head = new ListNode((a+b)%10);
        ListNode origin = head;
        int carry = (a+b)/10;
        l1=l1.next;
        l2=l2.next;
        while (l1 != null || l2 != null) {
            a = l1!=null?l1.val:0;
            b = l2!=null?l2.val:0;
            int sum = (a+b+carry)%10;
            carry = (a+b+carry)/10;
            head.next = new ListNode(sum);
            head = head.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        if(carry!=0){
            head.next=new ListNode(carry);
        }
        return origin;
    }
}
