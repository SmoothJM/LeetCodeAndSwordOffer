package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("([)]"));
//        System.out.println(isValid("(){[]}"));
        System.out.println(isValid("("));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        if (s.isEmpty()) {return true;}
        if (map.containsKey(s.charAt(0))) {return false;}
        for (int i=0; i<s.length();i++){
            if(map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty() && stack.peek().equals(map.get(s.charAt(i)))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
