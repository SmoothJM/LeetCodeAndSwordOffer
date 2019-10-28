package offer;

import java.util.Stack;

public class ReverseList_24 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode head2 = new ListNode(99);
        ListNode.show(head);
        ListNode.show(ReverseList2(head));
        ListNode.show(head2);
        ListNode.show(ReverseList2(null));
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
    
    public static ListNode ReverseList2(ListNode head) {
    	ListNode rev = null;
    	ListNode curr = head;
    	ListNode next = null;
    	ListNode pre = null;
    	while(curr != null) {
    		next = curr.next;
    		if(curr.next==null) 
    			rev = curr;
    		curr.next = pre;
    		pre = curr;
    		curr = next;
    		
    	}
    	
    	return rev;
    	
    	
    }
}
