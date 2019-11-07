package offer;

import java.util.Stack;

public class IsPopOrder_31 {
    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA1 = {3, 2, 4, 1, 5};
        int[] popA2 = {4, 3, 5, 1, 2};
        System.out.println(IsPopOrder2(pushA,popA1));
        System.out.println(IsPopOrder2(pushA, popA2));
    }


    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null && popA == null) return true;
        if (pushA == null || popA == null) return false;
        if (pushA.length != popA.length) return false;
        Stack<Integer> core = new Stack<>();
        int loc = 0;
        for (int i = 0; i < popA.length; i++) {
            if (core.isEmpty() || core.peek() != popA[i]) {
                if (loc >= pushA.length) return false;
                for (int j = loc; j < pushA.length; j++) {
                    core.add(pushA[j]);
                    loc = j + 1;
                    if (core.peek() == popA[i]) {
                        core.pop();
                        break;
                    }
                    if (j == pushA.length - 1) return false;
                }
            } else {
                core.pop();
            }
        }

        return true;
    }
    public static boolean IsPopOrder2(int[] pushA, int[] popA) {
        if (pushA == null && popA == null) return true;
        if (pushA == null || popA == null) return false;
        if (pushA.length != popA.length) return false;
        Stack<Integer> core = new Stack<>();
        int loc = 0;
        for (int i = 0; i < pushA.length; i++) {
            core.push(pushA[i]);
            while(!core.isEmpty() && core.peek()==popA[loc]){
                core.pop();
                loc++;
            }
        }

        return core.isEmpty();

    }
}
