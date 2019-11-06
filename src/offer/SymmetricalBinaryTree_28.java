package offer;

public class SymmetricalBinaryTree_28 {
    public static void main(String[] args) {
        System.out.println(isSymmetrical(TreeNode.buildTree()));
    }

    public static boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    public static boolean isSymmetrical(TreeNode p1,TreeNode p2){
        if(p1==null && p2==null) return true;
        if(p1==null || p2==null) return false;
        if(p1.val!=p2.val) return false;
        return isSymmetrical(p1.left,p2.right) && isSymmetrical(p1.right,p2.left);
    }

}
