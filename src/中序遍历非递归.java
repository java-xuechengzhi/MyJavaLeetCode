import java.util.Stack;

public class 中序遍历非递归 {

    public static void inorder(BTree root) {
        Stack<BTree> stack = new Stack<BTree>();
        BTree bTree = null;
        if(root != null) {
            bTree = root;
            while(!stack.isEmpty() || bTree != null) {
                while (bTree != null) {
                    stack.push(bTree);
                    bTree = bTree.left;
                }
                if(!stack.isEmpty()) {
                    bTree = stack.pop();
                    System.out.print(bTree.value + "  ");
                    bTree =  bTree.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        BTree root=new BTree(1);
        BTree Node2=new BTree(2);
        BTree Node3=new BTree(3);
        BTree Node4=new BTree(4);
        BTree Node5=new BTree(5);
        BTree Node6=new BTree(6);
        BTree Node7=new BTree(7);
        BTree Node8=new BTree(8);
        root.left=Node2;
        root.right=Node3;

        Node2.left=Node4;
        Node2.right=Node5;

        Node3.left=Node6;
        Node3.right=Node7;

        Node4.left=Node8;
        System.out.println();
        inorder(root);
    }
}
