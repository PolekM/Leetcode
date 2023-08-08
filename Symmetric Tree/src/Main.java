import java.util.Stack;

//KIEDYS DO POPRAWY, nie przechodzi w 1 przypadku, zrobić mirror
public class Main {

    public static void main(String[] args) {
        //TreeNode treeNode = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(2, new TreeNode(4),new TreeNode(3)));
        TreeNode treeNode = new TreeNode(1,new TreeNode(2,new TreeNode(2),null),new TreeNode(2,new TreeNode(2),null));
        System.out.println(isSymmetric(treeNode));
    }

    static Stack<Integer> stack = new Stack<>();
    public static boolean isSymmetric(TreeNode root) {


        generateStack(root,0);
        System.out.println(stack);
        int size = stack.size()-1;
        int i=0;
        while (i <= size/2){
            if(stack.get(i) !=stack.get(size-i)){
                return false;
            }
            i++;
        }
        return true;

    }

    public static Stack<Integer> generateStack(TreeNode root,Integer direction) {
        if (root == null) {
            stack.add(direction);
            return stack;
        }


        generateStack(root.left,-1);
        stack.push(root.val);
        generateStack(root.right,-2);

        return stack;
    }

}
