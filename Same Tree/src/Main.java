public class Main {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        isSameTree(p,q);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null){
            return true;
        }
        if((p!=null && q==null) || (p==null && q!=null))
            return false;

        boolean lpq = isSameTree(p.left,q.left);
        if(p.val != q.val){
            lpq = false;
        }
        boolean rpq =isSameTree(p.right,q.right);
        if(p.val != q.val){
            rpq = false;
        }
        return lpq && rpq;
    }
}
