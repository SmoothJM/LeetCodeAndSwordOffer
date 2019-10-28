package offer;

import java.util.Stack;

public class ReverseList_24 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode head2 = new ListNode(99);
        ListNode.show(head);
        ListNode.show(ReverseList(head));
//        ListNode.show(head2);
//        ListNode.show(ReverseList(head2));
    }

    public static ListNode ReverseList(ListNode head) {
        if(head == null) return head;
        Stack<ListNode> stack = new Stack<>();

        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode newHead = stack.pop();
        ListNode returnHead = newHead;
        while(!stack.isEmpty()){
            newHead.next = stack.pop();
            newHead = newHead.next;
        }
        newHead.next=null;
        return returnHead;
    }
}
