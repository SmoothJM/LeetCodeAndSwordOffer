package offer;

public class HasSubtree_26 {
	public static void main(String[] args) {
		TreeNode root8 = new TreeNode(8);
		TreeNode a8 = new TreeNode(8);
		TreeNode b7 = new TreeNode(7);
		TreeNode c9 = new TreeNode(9);
		TreeNode d2 = new TreeNode(2);
		TreeNode e4 = new TreeNode(4);
		TreeNode f7 = new TreeNode(7);
		TreeNode sub8 = new TreeNode(2);
		TreeNode g9 = new TreeNode(4);
		TreeNode h2 = new TreeNode(7);
		root8.left = a8;
		root8.right = b7;
		a8.left = c9;
		a8.right = d2;
		d2.left = e4;
		d2.right = f7;

		sub8.left = g9;
		sub8.right = h2;

//		TreeNode.showPreOrder(root8);
//		System.out.println("---------------");
//		TreeNode.showPreOrder(sub8);
		System.out.println(HasSubtree(root8, sub8));
	}

	public static boolean HasSubtree(TreeNode main, TreeNode sub) {
		if (main == null || sub == null)
			return false;
		boolean flag = false;
		flag = sameTree(main, sub);
		if (!flag)
			flag = HasSubtree(main.left, sub);
		if (!flag)
			flag = HasSubtree(main.right, sub);
		return flag;
	}

	public static boolean sameTree(TreeNode main, TreeNode sub) {
		if(sub==null) return true;
		if(main==null) return false;
		if(main.val!=sub.val) {
			return false;
		}
		return sameTree(main.left, sub.left) && sameTree(main.right, sub.right);
	}
}
