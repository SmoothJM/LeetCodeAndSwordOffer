package offer;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        loopTreeNode(TreeNode.buildTree());
        TreeNode.showPreOrder(TreeNode.buildTree());
    }


    private static void bigPlus(String a, String b) {
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int a1 = 0;
        int b1 = 0;
        while(i>=0 || j>=0){
            a1 = i>=0? a.charAt(i)-'0':0;
            b1 = j>=0? b.charAt(j)-'0':0;
            sum = a1 + b1 + carry;
            carry = sum/10;
            sum = sum%10;
            sb.append(sum);
            i--;
            j--;
        }
        if(carry>0){
            sb.append(1);
        }
        System.out.println(sb.reverse().toString());
    }

    public static void loopTreeNode(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){
            if(root!=null){
                System.out.print(root.val+" ");
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop().right;
            }
        }
        System.out.println();
    }

}
