package offer;


class TreeNode2{
    String val;
    TreeNode2 parent;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2(String val){
        this.val = val;
        this.parent=null;
        this.left=null;
        this.right=null;
    }
}

public class NextNodeOfBinaryTree_08 {
    public static void main(String[] args) {
        //TreeNode2 root = buildTree();
        TreeNode2 a = new TreeNode2("a");
        TreeNode2 b = new TreeNode2("b");
        TreeNode2 c = new TreeNode2("c");
        TreeNode2 d = new TreeNode2("d");
        TreeNode2 e = new TreeNode2("e");
        TreeNode2 f = new TreeNode2("f");
        TreeNode2 g = new TreeNode2("g");
        TreeNode2 h = new TreeNode2("h");
        TreeNode2 i = new TreeNode2("i");
        a.left = b;
        a.right = c;
        b.parent = a;
        b.left = d;
        b.right=e;
        c.parent=a;
        c.left=f;
        c.right = g;
        d.parent=b;
        e.parent=b;
        e.left=h;
        e.right=i;
        f.parent=c;
        g.parent=c;
        h.parent=e;
        i.parent=e;
        TreeNode2[] ts = new TreeNode2[]{a,b,c,d,e,f,g,h,i};
        for (int j = 0; j < ts.length; j++) {
            findNextNode(ts[j]);
        }
    }
    public static void findNextNode(TreeNode2 node){
        if(node == null){return;}
        if(node.right != null){
            node = node.right;
            while(node.left!=null){
                node = node.left;
            }
            System.out.println(node.val);
            return;
        }else{
            if(node==node.parent.left){
                System.out.println(node.parent.val);
                return;
            }else{
                while(node.parent!=null){
                    node = node.parent;
                    if(node.parent!=null && node.parent.left == node){
                        System.out.println(node.parent.val);
                        return;
                    }
                }
                System.out.println("null");
            }
        }
    }


    /**
     * build the tree to generate test case
     * @return root
     */
    public static TreeNode2 buildTree(){
        TreeNode2 a = new TreeNode2("a");
        TreeNode2 b = new TreeNode2("b");
        TreeNode2 c = new TreeNode2("c");
        TreeNode2 d = new TreeNode2("d");
        TreeNode2 e = new TreeNode2("e");
        TreeNode2 f = new TreeNode2("f");
        TreeNode2 g = new TreeNode2("g");
        TreeNode2 h = new TreeNode2("h");
        TreeNode2 i = new TreeNode2("i");
        a.left = b;
        a.right = c;
        b.parent = a;
        b.left = d;
        b.right=e;
        c.parent=a;
        c.left=f;
        c.right = g;
        d.parent=b;
        e.parent=b;
        e.left=h;
        e.right=i;
        f.parent=c;
        g.parent=c;
        h.parent=e;
        i.parent=e;
        return a;
    }
    public static void preOrder(TreeNode2 root){
        if(root == null){return;}
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void midOrder(TreeNode2 root){
        if(root == null){return;}
        midOrder(root.left);
        System.out.print(root.val+" ");
        midOrder(root.right);
    }

}


