package easy;

import java.util.Map;

public class BalancedBinaryTree_110 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
//        System.out.println(depth(root.right));
//        System.out.println(depth(root.left));
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff = Math.abs((depth(root.left)-depth(root.right)));
        return diff<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int depth(TreeNode node){
        if(node == null){
            return 0;
        }else{
            TreeNode left = node.left;
            TreeNode right = node.right;
            return Math.max(depth(left),depth(right))+1;
        }
    }
}
