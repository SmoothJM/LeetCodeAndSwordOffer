package easy;




public class SameTree_100 {
    public static void main(String[] args) {


//        System.out.println(isSameTree());
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }
}
