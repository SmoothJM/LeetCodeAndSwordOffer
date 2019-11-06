package offer;

public class MirrorOfBinaryTree_27 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        TreeNode.showPreOrder(root);

    }

    public static void Mirror(TreeNode root) {
        if(root==null) return;
        if(root.right==null && root.left==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null) Mirror(root.left);
        if(root.right!=null) Mirror(root.right);
    }
}
