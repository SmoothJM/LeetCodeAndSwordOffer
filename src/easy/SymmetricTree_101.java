package easy;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree_101 {
    static String s1 = "";
    static String s2 = "";

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println(isSymmetric2(root));
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
//         a.left = c;
//         a.right = d;
//         b.left = e;
//         b.right = f;
        a.right = c;
        b.right = f;
        return root;
    }

    public static boolean isSymmetric(TreeNode root) {
        return sub(root,root);
    }
    public static boolean sub(TreeNode left, TreeNode right){
        if(left == null && right== null) return true;
        if(left == null || right== null) return false;
        return left.val == right.val && sub(left.left,right.right) && sub(left.right,right.left);
    }

    public static boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null) continue;
            if((t1 == null || t2 == null) || t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}

