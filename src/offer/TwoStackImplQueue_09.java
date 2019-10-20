package offer;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

//    MyQueue(){
//        this.s1 = null;
//        this.s2 = null;
//    }

    public void appendTail(int n) {
        if (!this.s2.isEmpty()) {
            this.s2Tos1();
        }
        this.s1.add(n);
    }

    public void deleteHead() {
        this.s1Tos2();
        if (this.s2 == null || this.s2.isEmpty()) {
            System.out.println(-1);
            return;
        }
        System.out.println(this.s2.pop());
    }

    public void showQueue() {
        if (!this.s2.isEmpty()) {
            this.s2Tos1();
        }
        if(this.s1.isEmpty()){
            System.out.println("empty queue...");
            return;
        }
        for (int i = 0; i < this.s1.size(); i++) {
            System.out.print(this.s1.get(i) + " ");
        }
        System.out.println();
    }

    private void s1Tos2() {
        int size = this.s1.size();
        for (int i = 0; i < size; i++) {
            this.s2.add(this.s1.pop());
        }
    }

    private void s2Tos1() {
        int size = this.s2.size();
        for (int i = 0; i < size; i++) {
            this.s1.add(this.s2.pop());
        }
    }


}


public class TwoStackImplQueue_09 {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        System.out.println("inserting...");
        mq.appendTail(1);
        mq.appendTail(2);
        mq.appendTail(3);
        mq.appendTail(4);
        mq.appendTail(5);
        mq.showQueue();
        System.out.println("deleting head...");
        mq.deleteHead();
        System.out.println("after delete...");
        mq.showQueue();
        System.out.println("inserting more...");
        mq.appendTail(500);
        mq.appendTail(600);
        mq.appendTail(700);
        mq.showQueue();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.deleteHead();
        mq.showQueue();
    }


}
