package offer;

import java.util.Stack;

class MinStack {
    private Stack<Integer> core = new Stack<>();
    private Stack<Integer> help = new Stack<>();

    /**
     * sizes of help and core are the same
     * @param node
     */
//    public void push(int node) {
//        core.push(node);
//        if (help.isEmpty() || help.peek() >= node) {
//            help.push(node);
//        } else {
//            help.push(help.peek());
//        }
//    }

    /**
     * match with same size stack
     */
//    public void pop() {
//        if (!core.isEmpty()) {
//            core.pop();
//            help.pop();
//        } else System.out.println("Empty stack, cannot pop!");
//    }
    /**
     * help only push small value. Then the size of help is
     * different with core.
     * @param node
     */
    public void push(int node) {
        core.push(node);
        if (help.isEmpty() || help.peek() >= node) {
            help.push(node);
        }
    }

    /**
     * match with different sizes stacks
     */
    public void pop() {
        if (!core.isEmpty()) {
            int temp = core.pop();
            if(temp==help.peek()) help.pop();
        } else System.out.println("Empty stack, cannot pop!");
    }

    public int top() {
        if (!core.isEmpty()) {
            return core.peek();
        } else {
            throw new RuntimeException("Empty stack!");
        }
    }

    public int min() {
        if (!help.isEmpty()) {
            return help.peek();
        } else {
            throw new RuntimeException("Empty stack!");
        }
    }
}


public class MinStack_30 {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(1);
        s.push(-5);
        s.push(9);
        System.out.println(s.min());
        s.push(11);
        s.push(-11);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
    }
}
