package easy;

import sun.reflect.generics.tree.Tree;

public class MaximumDepthOfBinaryTree_104 {
    public static void main(String[] args) {
        System.out.println(maxDepth(buildTree()));
    }

    public static TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        root.left = a;
        root.right = b;
         a.left = c;
         a.right = d;
         b.left = e;
         b.right = f;
        return root;
    }
    public static int maxDepth(TreeNode node) {
        if(node == null){
            return 0;
        }else{
            TreeNode left = node.left;
            TreeNode right = node.right;
            return Math.max(maxDepth(left),maxDepth(right))+1;
        }
    }
}
