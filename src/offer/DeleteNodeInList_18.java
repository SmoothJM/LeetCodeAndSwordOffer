package offer;

public class DeleteNodeInList_18 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		ListNode d = new ListNode(5);
		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = null;
		head = deleteNode2(head, a);
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
	}

	/**
	 * method 1: go through O(n)
	 * 
	 * @param head
	 * @param target
	 * @return
	 */
	public static ListNode deleteNode(ListNode head, ListNode target) {
		if (head == null || target == null) {
			return head;
		}
		ListNode originListNode = head;
		while(head!=null) {
			if(head == target) {
				originListNode = head.next;
				break;
			}else {
				if(head.next == target) {
					head.next = target.next;
					break;
				}
			}
			head = head.next;
		}
		return originListNode;
	}
	public static ListNode deleteNode2(ListNode head, ListNode target) {
		if (head == null || target == null) {
			return head;
		}
		ListNode originListNode = head;
		target = target.next;
		return originListNode;
	}
}
