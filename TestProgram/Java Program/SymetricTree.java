public class SymetricTree {
    public static void main(String[] args){

    }

    public boolean isSymetric(TreeNode root){
        return root == null || isSymetricHelp(root.left, root.right);
    }
    
    private boolean isSymetricHelp(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val) return false;

        return isSymetricHelp(left.left, left.right)
                &&
                isSymetricHelp(left.right, right.left);
    }
}
