import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(3), new TreeNode(2, new TreeNode(7), null));
        List<Integer> integers = inorderTraversal(treeNode);
        System.out.println(integers);
    }

    static List<Integer> list = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root == null)
            return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);





        return list;
    }
}
