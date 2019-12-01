package offer;

import java.util.Arrays;
import java.util.Stack;

public class SerializeDeserializeBinaryTree_37 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        System.out.println(Serialize2(root));
        TreeNode head1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(3);
        TreeNode c4 = new TreeNode(4);
        TreeNode d5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        head1.left = a2;
        head1.right = b3;
        a2.left = c4;
        b3.left = d5;
        b3.right = e6;

        System.out.println(Arrays.toString(Serialize(head1).split(",")));
        TreeNode.showPreOrder(Deserialize(Serialize2(head1)));
    }

    /**
     * stack implement
     * @param root
     * @return
     */
    public static String Serialize(TreeNode root) {
        if(root==null) return null;
        String result = "";
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp!=null){
                result+=temp.val+",";
                stack.push(temp.right);
                stack.push(temp.left);
            }else{
                result+="#,";
            }
        }
        return result.substring(0,result.length()-1);
    }

    /**
     * Recursion
     * @param root
     * @return
     */
    public static String Serialize2(TreeNode root) {
        String s = "";
        if(root==null) {
            return "#,";
        }
        s+=root.val+",";
        s+=Serialize2(root.left);
        s+=Serialize2(root.right);
        return s;
    }
    private static int index=-1;

    /**
     * 反序列化二叉树
     * @param str
     * @return
     */
    public static TreeNode Deserialize(String str) {
        if(str==null || str.length()==0) return null;
        index++;
        String ss[] = str.split(",");
        TreeNode root = null;
        if(!ss[index].equals("#")){
            root = new TreeNode(Integer.parseInt(ss[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        return root;
    }

}
