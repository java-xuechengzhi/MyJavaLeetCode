public class 二叉树的最大深度 {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }


    public static void main(String[] args) {

        TreeNode  root=new TreeNode(1);
        TreeNode Node2=new TreeNode(2);
        TreeNode Node3=new TreeNode(3);
        TreeNode Node4=new TreeNode(4);
        TreeNode Node5=new TreeNode(5);
        TreeNode Node6=new TreeNode(6);
        TreeNode Node7=new TreeNode(7);
        TreeNode Node8=new TreeNode(8);
        root.left=Node2;
        root.right=Node3;

        Node2.left=Node4;
        Node2.right=Node5;

        Node3.left=Node6;
        Node3.right=Node7;

        Node4.left=Node8;

        int result = maxDepth(root);
        System.out.println(result);
    }
}
