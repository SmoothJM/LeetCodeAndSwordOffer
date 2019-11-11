package offer;

import java.util.*;

public class FindPathInBinaryTree_34 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static ArrayList<Integer> l1 = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FindPath(TreeNode.buildTree(), 15).toArray()));
        System.out.println(Arrays.toString(FindPath2(TreeNode.buildTree(), 22).toArray()));
//        System.out.println(hasPath(TreeNode.buildTree(), 222));
    }

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return list;
        FindPathSub(root, target);
        return list;
    }

    public static void FindPathSub(TreeNode root, int target) {
        if (root == null) return;
        int sum = target - root.val;
        l1.add(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            list.add(new ArrayList<Integer>(l1));
        }
        if (root.left != null) {
            FindPathSub(root.left, sum);
        }
        if (root.right != null) {
            FindPathSub(root.right, sum);
        }
        l1.remove(l1.size() - 1);
    }

    public static boolean hasPath(TreeNode root, int target) {
        if (root == null) return false;
        int sum = target - root.val;
        if (root.left != null || root.right != null) {
            return hasPath(root.left, sum) || hasPath(root.right, sum);
        } else {
            return sum == 0;
        }
    }


    private static ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private static ArrayList<Integer> list2 = new ArrayList<Integer>();

    public static ArrayList<ArrayList<Integer>> FindPath2(TreeNode root, int target) {
        if (root == null) return listAll;
        list2.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list2));
        FindPath2(root.left, target);
        FindPath2(root.right, target);
        list2.remove(list2.size() - 1);
        return listAll;
    }
}
