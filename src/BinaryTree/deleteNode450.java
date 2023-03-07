package BinaryTree;

public class deleteNode450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (root.val > key){
            root.left = deleteNode(root.left,key);
        }
        if (root.val < key){
            root.right = deleteNode(root.right,key);
        }
        if (root.val == key){
            if (root.right==null&&root.left==null){
                return null;
            }
            if (root.right!=null&&root.left==null){
                return root.right;
            }
            if (root.left!=null&&root.right==null){
                return root.left;
            }
            if (root.left!=null&&root.right!=null){
                TreeNode temp = root.right;
                while (temp.left != null){
                    temp = temp.left;
                }
                root.val = temp.val;
                root.right = deleteNode(root.right,temp.val);
            }
        }
        return root;
    }
}
