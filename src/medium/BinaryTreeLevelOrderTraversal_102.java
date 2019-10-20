package medium;

import java.util.*;

public class BinaryTreeLevelOrderTraversal_102 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(levelOrder(buildTree()).toArray()));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new LinkedList<List<Integer>>();
        LinkedList<List<Integer>> outer = new LinkedList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);
        while(!nodes.isEmpty()){
            LinkedList<Integer> inner = new LinkedList<>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = nodes.poll();
                inner.add(temp.val);
                if(temp.left!=null){
                    nodes.add(temp.left);
                }
                if(temp.right!=null){
                    nodes.add(temp.right);
                }
            }
            outer.add(inner);
        }


        return outer;
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
}
