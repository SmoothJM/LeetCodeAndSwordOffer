package offer;

public class MirrorOfBinaryTree_27 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        TreeNode.showPreOrder(root);
        System.out.println();
        TreeNode.showPreOrder(Mirror(root));

    }

    public static TreeNode Mirror(TreeNode root) {
        if(root==null) return root;
        if(root.right==null && root.left==null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null) Mirror(root.left);
        if(root.right!=null) Mirror(root.right);
        return root;
    }
}
