package offer;

import java.util.ArrayList;
import java.util.Stack;

public class FindFirstCommonNode_52 {
    public static void main(String[] args) {

    }

    /**
     * list
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode solution1(ListNode h1, ListNode h2){
        if(h1==null || h2==null) return null;
        ArrayList<ListNode> list = new ArrayList<>();
        while(h1!=null){
            list.add(h1);
            h1 = h1.next;
        }
        while(h2!=null){
            if(list.contains(h2)) return h2;
            h2 = h2.next;
        }
        return null;
    }


    /**
     * 思路：双指针，每个指针都各走一遍两个链表，这样就会走到一起。
     * 是不是很浪漫的说法哈哈哈
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode solution2(ListNode h1, ListNode h2){
        if(h1==null || h2==null) return null;
        ListNode p1 = h1;
        ListNode p2 = h2;
        while(p1!=p2){
            p1 = p1!=null?p1.next:h2;
            p2 = p2!=null?p2.next:h1;
        }
        return p1;
    }

    /**
     * 栈
     * 思路：从后往前遍历
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode solution3(ListNode h1, ListNode h2){
        if(h1==null || h2==null) return null;
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(h1!=null) {
            s1.push(h1);
            h1 = h1.next;
        }
        while(h2!=null) {
            s2.push(h2);
            h2 = h2.next;
        }
        ListNode t1 = null;
        ListNode t2 = null;
        while(!s1.isEmpty()&&!s2.isEmpty()){
            if(s1.peek()==s2.peek()){
                t1 = s1.pop();
                t2 = s2.pop();
            }else{
                return t1;
            }
        }
        return t1;
    }

    /**
     * 先遍历一遍算两个长度，再遍历一次的时候长的那个先走几步就行。
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode solution4(ListNode h1, ListNode h2){
        if(h1==null || h2==null) return null;
        ListNode p1 = h1;
        ListNode p2 = h2;
        int c1=0;
        int c2=0;
        while(p1!=null){
            c1++;
            p1=p1.next;
        }
        while(p2!=null){
            c2++;
            p2=p2.next;
        }
        p1 = c1>c2?h1:h2;
        p2 = c1<=c2?h1:h2;
        for (int i = 0; i < Math.abs(c1-c2); i++) {
            p1 = p1.next;
        }
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
