package dataStructure;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class WBTCBigPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        String num1 = nums[0];
        String num2 = nums[1];
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int n1 = 0;
        int n2 = 0;
        int maxLength = num1.length()>num2.length()?num1.length():num2.length();
        for (int i = 0; i < maxLength; i++) {
            if(i<num1.length()){
                n1 = Integer.parseInt(num1.charAt(i)+"");
                stack1.push(n1);
            }
            if(i<num2.length()){
                n2 = Integer.parseInt(num2.charAt(i)+"");
                stack2.push(n2);
            }
        }
        System.out.println(Arrays.toString(stack1.toArray()));
        System.out.println(Arrays.toString(stack2.toArray()));
        boolean flag=false;
        String result = "";
        int curr =0;
        for (int i = 0; i < maxLength; i++) {
            if(!stack1.isEmpty() && !stack2.isEmpty()){
                if(flag){
                    curr =stack1.pop()+stack2.pop()+1;
                }else{
                    curr =stack1.pop()+stack2.pop();
                }
                if(curr>=10){
                    curr = curr%10;
                    flag=true;
                }else{
                    flag=false;
                }
                result +=curr;
            }else if(stack1.isEmpty()){
                if(flag){
                    curr =stack2.pop()+1;
                }else{
                    curr =stack2.pop();
                }
                if(curr>=10){
                    curr = curr%10;
                    flag=true;
                }else{
                    flag=false;
                }
                result +=curr;
            }else if(stack2.isEmpty()){
                if(flag){
                    curr =stack1.pop()+1;
                }else{
                    curr =stack1.pop();
                }
                if(curr>=10){
                    curr = curr%10;
                    flag=true;
                }else{
                    flag=false;
                }
                result +=curr;
            }
        }

        if(flag){
            System.out.print(new StringBuffer(result+1).reverse().toString());
        }else{
            System.out.print(new StringBuffer(result).reverse().toString());
        }
    }
}
