package offer;

import java.util.ArrayList;

public class CountdownKthNodeOfList_22 {
	public static void main(String[] args) {
		ListNode head = ListNode.buildList();
		ListNode.show(head);
		int k=8;
		FindKthToTail2(head, k);
	}
	
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head==null) return head;
		ArrayList<ListNode> list = new ArrayList<>();
		while(head!=null) {
			list.add(head);
			head = head.next;
		}
		if(k>list.size() || k<1) return null;
		
		return list.get(list.size()-k);
    }

    public static ListNode FindKthToTail2(ListNode head, int k){
		if(head == null || k ==0) return head;
		ListNode first = head;
		ListNode second = head;
		for (int i = 0; i < k-1; i++) {
			if(first.next == null) return null;
			else first = first.next;

		}

		while(first.next!=null){
			second = second.next;
			first = first.next;
		}
		return second;
	}
}
