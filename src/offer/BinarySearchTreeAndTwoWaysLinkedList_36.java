package offer;

public class BinarySearchTreeAndTwoWaysLinkedList_36 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildSearchTree();
        TreeNode.showLevel(root);
        TreeNode.showMidOrder(root);
        System.out.println();
        TreeNode head = convert(root);
        while(head.right!=null){
            System.out.print(head.val+" ");
            head = head.right;
        }
        System.out.println(head.val);
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.left;
        }
    }

    private static TreeNode preNode=null;
    public static TreeNode convert(TreeNode root) {
        if(root == null) return root;
        TreeNode head = root;
        converNode(head);
        while(head.left!=null){
            head = head.left;
        }
        return head;
    }
    public static void converNode(TreeNode root){
        if(root==null) return;
        converNode(root.left);
        root.left=preNode;
        if(preNode!=null){
            preNode.right=root;
        }
        preNode = root;
        converNode(root.right);
    }
}
