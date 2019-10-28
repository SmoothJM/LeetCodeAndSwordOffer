package offer;


class TreeNodeWithParent{
    String val;
    TreeNodeWithParent parent;
    TreeNodeWithParent left;
    TreeNodeWithParent right;
    TreeNodeWithParent(String val){
        this.val = val;
        this.parent=null;
        this.left=null;
        this.right=null;
    }
}

public class NextNodeOfBinaryTree_08 {
    public static void main(String[] args) {
        //TreeNode2 root = buildTree();
        TreeNodeWithParent a = new TreeNodeWithParent("a");
        TreeNodeWithParent b = new TreeNodeWithParent("b");
        TreeNodeWithParent c = new TreeNodeWithParent("c");
        TreeNodeWithParent d = new TreeNodeWithParent("d");
        TreeNodeWithParent e = new TreeNodeWithParent("e");
        TreeNodeWithParent f = new TreeNodeWithParent("f");
        TreeNodeWithParent g = new TreeNodeWithParent("g");
        TreeNodeWithParent h = new TreeNodeWithParent("h");
        TreeNodeWithParent i = new TreeNodeWithParent("i");
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
        TreeNodeWithParent[] ts = new TreeNodeWithParent[]{a,b,c,d,e,f,g,h,i};
        for (int j = 0; j < ts.length; j++) {
            findNextNode(ts[j]);
        }
    }
    public static void findNextNode(TreeNodeWithParent node){
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
    public static TreeNodeWithParent buildTree(){
        TreeNodeWithParent a = new TreeNodeWithParent("a");
        TreeNodeWithParent b = new TreeNodeWithParent("b");
        TreeNodeWithParent c = new TreeNodeWithParent("c");
        TreeNodeWithParent d = new TreeNodeWithParent("d");
        TreeNodeWithParent e = new TreeNodeWithParent("e");
        TreeNodeWithParent f = new TreeNodeWithParent("f");
        TreeNodeWithParent g = new TreeNodeWithParent("g");
        TreeNodeWithParent h = new TreeNodeWithParent("h");
        TreeNodeWithParent i = new TreeNodeWithParent("i");
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
    public static void preOrder(TreeNodeWithParent root){
        if(root == null){return;}
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void midOrder(TreeNodeWithParent root){
        if(root == null){return;}
        midOrder(root.left);
        System.out.print(root.val+" ");
        midOrder(root.right);
    }

}


