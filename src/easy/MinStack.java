package easy;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> data;
	private Stack<Integer> helper;
	
	public MinStack() {
		this.helper = new Stack<>();
        this.data = new Stack<>();
    }
    
    public void push(int x) {
    	this.data.push(x);
    	if(this.helper.isEmpty() || this.helper.peek()>=x) {
    		this.helper.push(x);
    	}else {
    		this.helper.push(this.helper.peek());
    	}
        
    }
    
    public void pop() {
        if(!this.data.isEmpty()) {
        	this.data.pop();
        	this.helper.pop();
        }
    }
    
    public int top() {
    	if(!this.data.isEmpty())
        	return this.data.peek();
    	throw new RuntimeException("empty stack operation...");
    }
    
    public int getMin() {
    	if(!this.helper.isEmpty())
        	return this.helper.peek();
    	throw new RuntimeException("empty stack operation...");
    }
    
    public static void main(String[] args) {
		MinStack ms = new MinStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin());
		ms.pop();
		System.out.println(ms.top());
		System.out.println(ms.getMin());
		
	}
}
