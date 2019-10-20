package easy;

import java.util.List;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1,l2);
    }

    public static class ListNode {
        int value;
        ListNode next;
        ListNode(int x) {
            this.value = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l = new ListNode(-1);
        ListNode pre = l;
        while(l1.next!=null && l2.next!=null){
            if(l1.value<=l2.value){
                pre.next = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }

        pre.next = l1==null?l2:l1;

        return l.next;
    }
}

