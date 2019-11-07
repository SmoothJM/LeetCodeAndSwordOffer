package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom_32 {

    public static void main(String[] args) {
        TreeNode.showLevel(TreeNode.buildTree());
        System.out.println(Arrays.toString(PrintFromTopToBottom2(TreeNode.buildTree()).toArray()));
    }

    /**
     * linked list
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> l2 = new LinkedList<>();
        if(root==null) return list;
        l2.add(root);
        while(!l2.isEmpty()){
            int len = l2.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = l2.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    l2.add(temp.left);
                }
                if(temp.right!=null){
                    l2.add(temp.right);
                }
            }
        }
        return list;
    }

    /**
     * queue
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
        }
        return list;
    }
}
