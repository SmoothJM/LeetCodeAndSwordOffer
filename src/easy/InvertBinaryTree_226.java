package easy;

public class InvertBinaryTree_226 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        TreeNode.show(root);
        TreeNode.show(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        if(root.right==null && root.left==null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null) invertTree(root.left);
        if(root.right!=null) invertTree(root.right);
        return root;
    }
}

