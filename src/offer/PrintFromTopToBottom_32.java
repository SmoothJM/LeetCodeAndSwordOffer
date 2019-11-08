package offer;

import java.util.*;

public class PrintFromTopToBottom_32 {

    public static void main(String[] args) {
        TreeNode.showLevel(TreeNode.buildTree());
        System.out.println(Arrays.toString(PrintFromTopToBottom2(TreeNode.buildTree()).toArray()));
        System.out.println(Arrays.toString(PrintFromTopToBottom6(TreeNode.buildTree()).toArray()));
    }

    /**
     * linked list
     *
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> l2 = new LinkedList<>();
        if (root == null) return list;
        l2.add(root);
        while (!l2.isEmpty()) {
            int len = l2.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = l2.poll();
                list.add(temp.val);
                if (temp.left != null) {
                    l2.add(temp.left);
                }
                if (temp.right != null) {
                    l2.add(temp.right);
                }
            }
        }
        return list;
    }

    /**
     * queue
     *
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }
        return list;
    }

    /**
     * 逐层打印单循环，并且换行
     *
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom3(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int remain = 1;
        int next = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            System.out.print(temp.val + " ");
            remain--;
            if (temp.left != null) {
                queue.add(temp.left);
                next++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                next++;
            }
            if (remain == 0) {
                System.out.println();
                remain = next;
                next = 0;
            }
        }

        return list;
    }


    /**
     * 之字形打印二叉树
     *
     * @param root
     * @return
     */
    public static ArrayList<Integer> PrintFromTopToBottom4(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> odd = new Stack<>();
        Stack<TreeNode> even = new Stack<>();
        odd.add(root);
        boolean isOdd = true;
        while (!odd.isEmpty() || !even.isEmpty()) {
            if (isOdd) {
                TreeNode temp = odd.pop();
                list.add(temp.val);
                if (temp.left != null) even.push(temp.left);
                if (temp.right != null) even.push(temp.right);
            } else {
                TreeNode temp = even.pop();
                list.add(temp.val);
                if (temp.right != null) odd.push(temp.right);
                if (temp.left != null) odd.push(temp.left);
            }
            if (odd.isEmpty()) isOdd = false;
            else if (even.isEmpty()) isOdd = true;
        }
        return list;
    }

    /**
     * 之字形打印二叉树,嵌套arraylist
     *
     * @param root
     * @return
     */
    public static ArrayList<ArrayList<Integer>> PrintFromTopToBottom5(TreeNode root) {

        ArrayList<ArrayList<Integer>> stupid = new ArrayList<>();
        if (root == null) return stupid;
        Stack<TreeNode> odd = new Stack<>();
        Stack<TreeNode> even = new Stack<>();
        odd.add(root);
        boolean isOdd = true;
        while (!odd.isEmpty() || !even.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            if (isOdd) {
                while (!odd.isEmpty()) {
                    TreeNode temp = odd.pop();
                    list.add(temp.val);
                    if (temp.left != null) even.push(temp.left);
                    if (temp.right != null) even.push(temp.right);
                }
            } else {
                while (!even.isEmpty()) {
                    TreeNode temp = even.pop();
                    list.add(temp.val);
                    if (temp.right != null) odd.push(temp.right);
                    if (temp.left != null) odd.push(temp.left);
                }
            }
            stupid.add(list);
            if (odd.isEmpty()) isOdd = false;
            else if (even.isEmpty()) isOdd = true;
        }
        return stupid;
    }

    /**
     * 层序打印二叉树,嵌套arraylist
     *
     * @param root
     * @return
     */
    public static ArrayList<ArrayList<Integer>> PrintFromTopToBottom6(TreeNode root) {
        ArrayList<ArrayList<Integer>> stupid = new ArrayList<>();
        if (root == null) return stupid;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            stupid.add(list);
        }
        return stupid;
    }
}
