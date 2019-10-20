package offer;

import java.util.Stack;

class ListNode{
    public int value;
    public ListNode next;

    ListNode(int value) {
        this.value = value;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
}

public class PrintListFromTail_06 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        ListNode l9 = new ListNode(9);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l6);
        l6.setNext(l7);
        l7.setNext(l8);
        l8.setNext(l9);
        l9.setNext(null);
        printNode(null);
        System.out.println("===");
        printNode2(l1);
    }

    /**
     * 用stack实现
     * @param l
     */
    public static void printNode(ListNode l){
        Stack<ListNode> stack = new Stack<>();
        while(l!=null){
            stack.push(l);
            l = l.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().value);
        }
    }

    /**
     * 用递归实现
     * @param l
     */
    public static void printNode2(ListNode l){
        if(l!=null){
            if(l.next!=null){
                printNode2(l.next);
            }
            System.out.println(l.value);
        }
    }
}
