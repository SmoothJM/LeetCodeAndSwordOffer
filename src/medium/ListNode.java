package medium;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    public static void show(ListNode head){
        if(head == null){
            System.out.println("null");
            return;
        }
        while(head!=null){
            if(head.next == null){
                System.out.print(head.val);
            }else{
                System.out.print(head.val+" => ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
