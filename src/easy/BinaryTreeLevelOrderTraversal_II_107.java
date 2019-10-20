package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_II_107 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(levelOrderBottom(buildTree()).toArray()));
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new LinkedList<List<Integer>>();
        }
        LinkedList<TreeNode> node = new LinkedList<>();
        LinkedList<List<Integer>> outer = new LinkedList<>();
        node.add(root);
        while(!node.isEmpty()){
            LinkedList<Integer> inner = new LinkedList<>();
            int size = node.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = node.poll();
                inner.add(temp.val);
                if(temp.left!=null){
                    node.add(temp.left);
                }
                if(temp.right!=null){
                    node.add(temp.right);
                }
            }
            outer.addFirst(inner);
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
