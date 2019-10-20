package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        this.val = x;
    }
}

public class WY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        int[] l = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            l[i] = Integer.parseInt(s[i]);
        }
        ListNode2 head = new ListNode2(l[0]);
        ListNode2 node = head;
        for (int i = 1; i < l.length; i++) {
            node.next = new ListNode2(l[i]);
            node = node.next;
        }
        removeDuplicates(head);
    }

    public static void removeDuplicates(ListNode2 head) {
        if (head == null || head.next == null) {
            return;
        }
        int count = 1;
        while (head.next != null) {
            if (head.next.val != head.val) {
                count = 1;
            } else {
                if (count < 2) {
                    count++;
                } else {
                    ListNode2 temp = head.next;
                    while(temp!=null && temp.val==head.val){
                        temp = temp.next;
                    }
                    head.next = temp;
                    continue;
                }
            }
            head = head.next;
        }
    }
//    public static void removeDuplicates(ListNode2 head) {
//        if(head==null || head.next ==null){return;}
//        ArrayList<Integer> list = new ArrayList<>();
//        int count = 1;
//        list.add(head.val);
//        while(head.next!=null){
//            head = head.next;
//            if(list.get(list.size()-1) != head.val){
//                list.add(head.val);
//                count = 1;
//            }else{
//                if(count<2){
//                    count++;
//                    list.add(head.val);
//                }
//            }
//        }
//        ListNode2 head2 = new ListNode2(list.get(0));
//        ListNode2 node = head2;
//        for (int i = 1; i < list.size(); i++) {
//            node.next = new ListNode2(list.get(i));
//            node = node.next;
//        }
//        head = head2;
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(list.get(i)+" ");
//            }
//        }
//    }
}
