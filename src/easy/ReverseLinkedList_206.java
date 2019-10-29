package easy;

import java.util.Stack;

public class ReverseLinkedList_206 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode.show(head);
        ListNode.show(reverseList3(head));
        System.out.println("===");
        ListNode h2 = new ListNode(5);
        ListNode.show(reverseList3(h2));
        System.out.println("===");
        ListNode.show(reverseList3(null));
    }

    /**
     * stack
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head==null) return head;
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode headNew = stack.pop();
        head = headNew;
        while(!stack.isEmpty()){
            head.next = stack.pop();
            head = head.next;
        }
        head.next=null;
        return headNew;
    }

    /**
     * 三指针方法
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        if (head==null) return head;
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        ListNode headNew = null;
        while(curr!=null){
            next = curr.next;
            if(next == null) headNew = curr;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return headNew;
    }

    public static ListNode reverseList3(ListNode head) {
        if (head==null) return head;
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        ListNode headNew = null;
        while(curr!=null){
            next = curr.next;
//            if(next == null) headNew = curr;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
