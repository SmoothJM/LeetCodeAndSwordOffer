package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public static void show(ListNode head) {
        if (head == null) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println("}");
    }
}

public class Jessica {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(7);
        head1.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        ListNode head2 = new ListNode(1);
        ListNode a2 = new ListNode(22);
        ListNode b2 = new ListNode(3);
        ListNode c2 = new ListNode(44);
        ListNode d2 = new ListNode(5);
        ListNode e2 = new ListNode(66);
        ListNode f2 = new ListNode(7);
        head2.next = a2;
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;
        e2.next = f2;
        f2.next = null;

//        ListNode result = union(head1, head2);
//        ListNode.show(result);
//        ListNode result2 = insection(head1, head2);
//        ListNode.show(result2);
        ArrayList<Integer> la = new ArrayList<>();
        la.add(1);
        la.add(2);
        la.add(3);

        ArrayList<Integer> lb = new ArrayList<>();
        lb.add(1);
        lb.add(23);
        lb.add(3);
        ArrayList<Integer> result3 = insection2(la,lb);
        System.out.println(Arrays.toString(result3.toArray()));
        String as = "asd";
        as.split("1");
    }

    public static ListNode union(ListNode la, ListNode lb) {
        if (la == null && lb == null) return null;
        if (la == null || lb == null) return la == null ? lb : la;
        ListNode head = new ListNode(la.value);
        ListNode lc = head;
        la = la.next;
        Set<Integer> set = new HashSet<>();
        while (la != null) {
            set.add(la.value);
            la = la.next;
        }
        while (lb != null) {
            set.add(lb.value);
            lb = lb.next;
        }
        for (int vs : set) {
            head.next = new ListNode(vs);
            head = head.next;
        }
        return lc;
    }

    public static ListNode insection(ListNode la, ListNode lb) {
        if (la == null || lb == null) return null;
        ListNode head = new ListNode(la.value);
        ListNode lc = head;
        Set<Integer> set = new HashSet<>();
        while (la != null) {
            set.add(la.value);
            la = la.next;
        }
        boolean flag = true;
        while (lb != null) {
            if (set.contains(lb.value)) {
                set.remove(lb.value);
                if (flag) {
                    head.value = lb.value;
                    flag = !flag;
                } else {
                    head.next = new ListNode(lb.value);
                    head = head.next;
                }
            }
            lb = lb.next;
        }

        return lc;
    }

    public static ArrayList<Integer> union2(ArrayList<Integer> la, ArrayList<Integer> lb) {
        if (la == null && lb == null) return null;
        if (la == null || lb == null) return la == null ? lb : la;
        ArrayList<Integer> lc = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int len = la.size() > lb.size() ? la.size() : lb.size();
        for (int i = 0; i < len; i++) {
            int va = i<la.size()?la.get(i):la.get(0);
            int vb = i<lb.size()?lb.get(i):lb.get(0);
            set.add(va);
            set.add(vb);
        }
        for (int vs : set) {
            lc.add(vs);
        }
        return lc;
    }

    public static ArrayList<Integer> insection2(ArrayList<Integer> la, ArrayList<Integer> lb) {
        if (la == null || lb == null) return null;
        ArrayList<Integer> lc = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < la.size(); i++) {
            set.add(la.get(i));
        }
        for (int i = 0; i < lb.size(); i++) {
            int vb = lb.get(i);
            if(set.contains(lb.get(i))){
                set.remove(vb);
                lc.add(vb);
            }
        }

        return lc;
    }
}
