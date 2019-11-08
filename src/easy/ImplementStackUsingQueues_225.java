package easy;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> core = new LinkedList<>();
    Queue<Integer> help = new LinkedList<>();
    int x;

    public MyStack() {

    }

    public void push(int x) {
        this.x = x;
        if(!this.help.isEmpty()){
            while(!this.help.isEmpty()){
                core.add(help.poll());
            }
        }
        core.add(x);
    }

    public int pop() {
        if(this.core.isEmpty() && !this.help.isEmpty()){
            while(!this.help.isEmpty()){
                core.add(help.poll());
            }
        }
        while (this.core.size()!=1) {
            this.x = this.core.poll();
            this.help.add(this.x);
        }
        return this.core.poll();
    }


    public int top() {
        return this.x;
    }

    public boolean empty() {
        return core.isEmpty() && help.isEmpty();
    }
}


public class ImplementStackUsingQueues_225 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(6);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.push(11);
        System.out.println(stack.top());
        System.out.println(stack.empty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
    }
}
