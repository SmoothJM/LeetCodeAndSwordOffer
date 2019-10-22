package easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_141 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode a1 = new ListNode(2);
        ListNode b1 = new ListNode(0);
        ListNode c1 = new ListNode(-4);
        l1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = a1;

        ListNode l2 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        l2.next = a2;
        a2.next = l2;

        ListNode l3 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode b3 = new ListNode(4);
        ListNode c3 = new ListNode(6);
        l3.next = a3;
        a3.next = b3;
        b3.next = c3;

        ListNode l4 = new ListNode(1);
        ListNode a4 = new ListNode(2);
        l4.next = a4;
        a4.next = a4;

        ListNode l5 = new ListNode(1);
        l5.next = l5;

        System.out.println(hasCycle3(l1));
        System.out.println(hasCycle3(l2));
        System.out.println(hasCycle3(l3));
        System.out.println(hasCycle3(l4));
        System.out.println(hasCycle3(l5));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode origin = head;
        while(head!=null) {
            if(head == head.next) return true;
            ListNode temp = origin;
            while(temp!=head) {
                if(head.next==temp || head.next==head){
                    return true;
                }

                temp = temp.next;
            }
            head = head.next;
        }

        return false;
    }

    public static boolean hasCycle2(ListNode head){
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle3(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
