public class Main {

    public static void main(String[] args) {
        invertTree(new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9))));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
