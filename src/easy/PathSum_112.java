package easy;

public class PathSum_112 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        TreeNode.show(root);
        hasPathSum(root, 22);

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum = sum - root.val;
        if (root.left == null && root.right == null){
            return sum==0;
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }

    public static int count(TreeNode root) {
        int result = 0;

        return result;
    }
}
