package dataStructure;



import java.util.LinkedList;

public class LevelBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildTree();
        levelOrder(root);
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

    public static void levelOrder(TreeNode root){
        if(root == null) return;
        LinkedList<TreeNode> l = new LinkedList<>();
        l.add(root);
        while(!l.isEmpty()){
            TreeNode temp = l.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null){
                l.offer(temp.left);
            }
            if(temp.right != null){
                l.offer(temp.right);
            }
        }
    }
}
