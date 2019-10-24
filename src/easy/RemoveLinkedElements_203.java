package easy;

public class RemoveLinkedElements_203 {
	public static void main(String[] args) {
		ListNode head = ListNode.buildList();
		int val = 2;
		ListNode a = new ListNode(1);
		ListNode.show(head);
		ListNode.show(removeElements3(head, val));
	}

	/**
	 * 创建虚拟头节点
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode removeElements(ListNode head, int val) {
		if(head==null) return head;
		ListNode pre = new ListNode(val-1);
		ListNode origin = pre;
		pre.next = head;
		while(head!=null) {
			if(head.val==val) {
				pre.next = head.next;
			}else {
				pre = pre.next;
			}
			head = head.next;
			
		}
		
		return origin.next;
	}
	
	/**
	 * 单独考虑头节点，也就是找到第一个不和val相等点头节点，然后开始删除
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode removeElements2(ListNode head, int val) {
		if(head==null) return head;
		while(head!=null && head.val==val) {
			head = head.next;
		}
		if(head==null) return head;
		ListNode origin = head;
		ListNode pre = head;
		head = head.next;
		while(head!=null) {
			if(head.val==val) {
				pre.next=head.next;
			}else {
				pre = pre.next;
			}
			head = head.next;
		}
		
		return origin;
	}
	/**
	 * 和第二个方法类似，只是尝试不要origin保存头节点的方式
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode removeElements3(ListNode head, int val) {
		if(head==null) return head;
		while(head!=null && head.val==val) {
			head = head.next;
		}
		if(head==null) return head;
		
		ListNode pre = head;
		while(pre.next!=null) {
			if(pre.next.val==val) {
				pre.next=pre.next.next;
			}else {
				pre = pre.next;
			}
		}
		
		return head;
	}
	
}
