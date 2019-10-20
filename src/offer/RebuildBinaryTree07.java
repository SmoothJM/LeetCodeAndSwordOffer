package offer;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }
}

public class RebuildBinaryTree07 {
    public static void main(String[] args) {
        int[] preOrder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] midOrder = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = rebuild(preOrder, midOrder,0,preOrder.length-1,0,midOrder.length-1);
        TreeNode r2 = reConstructBinaryTree(preOrder,midOrder);
        preT(r2);
    }

    public static TreeNode rebuild(int[] pre, int[] mid, int pStart, int pEnd, int mStart, int mEnd) {
        TreeNode root = new TreeNode(pre[pStart]);
        int index = mStart;
        while (root.val != mid[index] && index <= mEnd) {
            index++;
        }
        int leftLength = index - mStart;
        if (leftLength > 0) {
            root.left = rebuild(pre, mid, pStart + 1, pStart + leftLength, mStart, index - 1);
        }
        if (leftLength < mEnd - mStart) {
            root.right = rebuild(pre, mid, pStart + leftLength + 1, pEnd, index + 1, mEnd);
        }
        return root;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] mid) {
        if(pre.length==0 || mid.length==0){
            return null;
        }
        TreeNode curr = new TreeNode(pre[0]);
        int index = 0;
        for (int i = 0; i < mid.length; i++) {
            if(mid[i]==curr.val){
                index = i;
                break;
            }
        }

        curr.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(mid,0,index));
        curr.right = reConstructBinaryTree(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(mid,index+1,mid.length));
        return curr;
    }

    public static void preT(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preT(root.left);
        preT(root.right);
    }
}
