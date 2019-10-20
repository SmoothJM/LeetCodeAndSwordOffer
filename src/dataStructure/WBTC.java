package dataStructure;

import java.util.*;

public class WBTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input == null || input.length() == 0) {
            System.out.print(true);
            System.exit(1);
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='(' || input.charAt(i)==')'){
                if (input.charAt(i) == '(') {
                    stack.push(input.charAt(i));
                } else {
                    if (!stack.isEmpty() && input.charAt(i) == ')') {
                        stack.pop();
                    } else {
                        System.out.print(false);

                        System.exit(1);
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    public static boolean check(String input) {
        if (input == null || input.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else {
                if (!stack.isEmpty() && input.charAt(i) == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
