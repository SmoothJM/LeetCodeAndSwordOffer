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
        TreeNode d = new TreeNode(13);
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
}
