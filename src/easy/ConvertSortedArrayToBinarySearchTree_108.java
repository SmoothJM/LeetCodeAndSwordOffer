package easy;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree_108 {
    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(nums);
        preOrder(treeNode);
        System.out.println();
        midOrder(treeNode);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0) return null;
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;
    }

    public static void preOrder(TreeNode node){
        if(node == null) return;
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void midOrder(TreeNode node){
        if(node == null) return;
        midOrder(node.left);
        System.out.print(node.val+" ");
        midOrder(node.right);
    }
}
