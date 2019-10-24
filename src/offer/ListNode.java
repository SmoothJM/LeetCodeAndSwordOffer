package offer;

public class ListNode {
	    public int value;
	    public ListNode next;

	    ListNode(){}
	    ListNode(int value) {
	        this.value = value;
	    }

	    public static ListNode buildList(){
			ListNode head = new ListNode(1);
			ListNode a = new ListNode(2);
			ListNode b = new ListNode(3);
			ListNode c = new ListNode(4);
			ListNode d = new ListNode(5);
			ListNode e = new ListNode(6);
			ListNode f = new ListNode(7);
			head.next = a;
			a.next = b;
			b.next = c;
			c.next = d;
			d.next = e;
			e.next = f;
			f.next = null;
			return head;
		}

		public static void show(ListNode head){
	    	if(head == null){
				System.out.println("null");
				return;
			}
	    	while(head!=null){
				if(head.next == null){
					System.out.print(head.value);
				}else{
					System.out.print(head.value+" => ");
				}
				head = head.next;
			}
			System.out.println();
		}
}
