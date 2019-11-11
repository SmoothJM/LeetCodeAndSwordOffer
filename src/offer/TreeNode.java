package offer;

import java.util.LinkedList;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode buildTree() {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(9);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(1);
        root.left = a;
        root.right = b;
        a.left = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.right = h;
        return root;
    }
    public static TreeNode buildSearchTree() {
        TreeNode root10 = new TreeNode(10);
        TreeNode a6 = new TreeNode(6);
        TreeNode b14 = new TreeNode(14);
        TreeNode c4 = new TreeNode(4);
        TreeNode d8 = new TreeNode(8);
        TreeNode e12 = new TreeNode(12);
        TreeNode f16 = new TreeNode(16);
        root10.left = a6;
        root10.right = b14;
        a6.left = c4;
        a6.right = d8;
        b14.left = e12;
        b14.right = f16;
        return root10;
    }
    public static void showLevel(TreeNode root){
        if(root == null) {
            System.out.println("null");
            return;
        }
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int length = nodes.size();
            for (int i = 0; i < length; i++) {
                TreeNode temp = nodes.poll();
                System.out.print(temp.val+" ");
                if(temp.left!=null){
                    nodes.add(temp.left);
                }
                if(temp.right!=null){
                    nodes.add(temp.right);
                }
            }
            System.out.println();
        }
    }
    
    public static void showPreOrder(TreeNode root) {
    	if(root == null) return;
    	System.out.print(root.val+" ");
    	showPreOrder(root.left);
    	showPreOrder(root.right);
    }
    public static void showMidOrder(TreeNode root) {
        if(root == null) return;
        showMidOrder(root.left);
        System.out.print(root.val+" ");
        showMidOrder(root.right);
    }
}
