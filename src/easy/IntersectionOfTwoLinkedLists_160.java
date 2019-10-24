package easy;

import java.util.*;


public class IntersectionOfTwoLinkedLists_160 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(8);
        ListNode c1 = new ListNode(4);
        ListNode d1 = new ListNode(5);
        l1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;

        ListNode l2 = new ListNode(5);
        ListNode a2 = new ListNode(0);
        ListNode b2 = new ListNode(1);
        l2.next = a2;
        a2.next = b2;
        b2.next = b1;
        
        ListNode l3 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        l3.next = a3;
        a3.next = b3;
        b3.next = null;
        
        ListNode.show(l1);
        ListNode.show(l2);
        ListNode.show(l3);
        
        System.out.println(getIntersectionNode2(l1,l2).val);
//        System.out.println(getIntersectionNode(l1,l3).value);
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
//		Map<ListNode, Integer> map = new HashMap<>();
		ArrayList<ListNode> list = new ArrayList<>();
		while(headA!=null) {
//			map.put(headA, headA.value);
			list.add(headA);
			headA = headA.next;
		}
		while(headB!=null) {
//			if(map.containsKey(headB)) {
			if(list.contains(headB)) {
				return headB;
			}
			headB = headB.next;
		}
		return null;
		
	}
	
	
	public static ListNode getIntersectionNode2(ListNode headA,ListNode headB) {
		if(headA == null || headB == null) return null;
		ListNode pa = headA;
		ListNode pb = headB;
		while(pa!=pb) {
			pa = pa==null? headB:pa.next;
			pb = pb==null? headA:pb.next;
		}
		return pb;
	}
	
}
