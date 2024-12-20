
class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode temp=root.left;//swap children nodes
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);//recurssion and traversal
        invertTree(root.right);
        return root;
    }
}
