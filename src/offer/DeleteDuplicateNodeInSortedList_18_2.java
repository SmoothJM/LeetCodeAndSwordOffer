package offer;

public class DeleteDuplicateNodeInSortedList_18_2 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode.show(head);
        head = deleteDuplication(head);
//        head = delete(head);
        ListNode.show(head);

    }

    /**
     * 去重，并且把出现重复的原节点也删掉
     * 1 => 2 => 3 => 3 => 4 => 4 => 5
     * 1 => 2 => 5
     * @param pHead
     * @return
     */

    public static ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null) return pHead;
        ListNode preNode = new ListNode();
        preNode.next = pHead;
        ListNode origin = pHead;
        while(pHead!=null) {
            if(pHead.next!=null && pHead.value == pHead.next.value){
                while(pHead.next!=null && pHead.value == pHead.next.value){
                    pHead = pHead.next;
                }
                preNode.next = pHead.next;
            }else{
                preNode = pHead;
            }
            pHead = pHead.next;
        }
        return origin;
    }

    /**
     * 去重，但是不删除重复的原节点
     * 1 => 2 => 3 => 3 => 4 => 4 => 5
     * 1 => 2 => 3 => 4 => 5
     * @param head
     * @return
     */
    public static ListNode delete(ListNode head){
        if(head == null) return head;
        ListNode origin = head;
        while(head!=null){
            ListNode nextNode = head.next;
            if(nextNode!=null && head.value==nextNode.value){
                while(nextNode!=null && head.value == nextNode.value){
                    nextNode = nextNode.next;
                }
                head.next = nextNode;
            }
            head = head.next;
        }
        return origin;
    }
}
