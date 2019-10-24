package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicatesFromSortedList_83 {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(1);
        ListNode h3 = new ListNode(2);
        ListNode h4 = new ListNode(2);
        ListNode h5 = new ListNode(4);
        h1.next = h2;
//        h2.next = h3;
//        h3.next = h4;
//        h4.next = h5;

        ListNode l = deleteDuplicates2(h1);
        while(l!=null){
            System.out.print(l.val+" ");
            l = l.next;
        }
    }

    /**
     * this is for disordered list
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        Set<Integer> set = new HashSet<>();
        ArrayList<ListNode> ls = new ArrayList<>();
        while(head!=null){
            if(!set.contains(head.val)){
                set.add(head.val);
                ls.add(head);
            }
            head = head.next;
        }
        ListNode newHead = null;
        ls.get(0).next=null;
        for (int i = 1; i < ls.size(); i++) {
            ls.get(i).next=null;
            ls.get(i-1).next = ls.get(i);
        }
        newHead = ls.get(0);
        return newHead;
    }

    /**
     * this is for ordered list
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode newHead = head;
        while(head!=null){
            if(head.next != null && head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return newHead;
    }
}

