package BinaryTree;

public class mergeTrees617 {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //递归的思想
        TreeNode node = new TreeNode();
        if (root1!=null&&root2!=null){
            node.val = root1.val+root2.val;
            node.right = mergeTrees(root1.right,root2.right);
            node.left = mergeTrees(root1.left,root2.left);
            return node;
        }
        if (root1==null&&root2!=null){
            return root2;
        }
        if (root1!=null&&root2==null){
            return root1;
        }
        return null;
    }




}
