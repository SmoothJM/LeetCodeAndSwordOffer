package offer;

import java.util.ArrayList;

public class CountdownKthNodeOfList_22 {
	public static void main(String[] args) {
		ListNode head = ListNode.buildList();
		ListNode.show(head);
		int k=3;
		System.out.println(FindKthToTail(head, k).value);
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
}
