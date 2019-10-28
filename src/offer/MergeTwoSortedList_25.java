package offer;

public class MergeTwoSortedList_25 {
	public static void main(String[] args) {
		ListNode h1 = ListNode.buildList();
		ListNode h2 = ListNode.buildList();
		ListNode h3 = new ListNode(5);
		ListNode a = new ListNode(6);
		ListNode b = new ListNode(9);
		h3.next = a;
		a.next = b;
		b.next = null;
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(9);
		ListNode.show(h1);
		ListNode.show(h3);
		ListNode.show(Merge2(h1, h3));
	}

	public static ListNode Merge(ListNode l1, ListNode l2) {
//		if (l1==null && l2==null) return null;
		if (l1==null) return l2;
		if (l2==null) return l1;
		ListNode head = null;
		if (l1.value>l2.value) {
			head = l2;
			l2 = l2.next;
		}else {
			head = l1;
			l1 = l1.next;
		}
		ListNode curr = head;
		while(l1!=null && l2!=null) {
			if (l1.value>l2.value) {
				head.next = l2;
				l2 = l2.next;
			}else {
				head.next = l1;
				l1 = l1.next;
			}
			head = head.next;
			
		}
		if(l1==null) {
			head.next = l2;
		}
		if(l2==null) {
			head.next = l1;
		}
		
		return curr;
	}
	
	/**
	 * 递归的方法，这样就不用判断最后还剩谁没遍历了。真聪明
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode Merge2(ListNode l1, ListNode l2) {
		if (l1==null) return l2;
		if (l2==null) return l1;
		ListNode head = null;
		if (l1.value>l2.value) {
			head = l2;
			head.next = Merge2(l1, l2.next);
		}else {
			head = l1;
			head.next = Merge2(l1.next, l2);
		}
		return head;
	}
}
