// LEET. 222. Count Complete Tree Nodes
class countNodes{
    int x=0;
    public int countNodes(TreeNode root) {
               traversal(root);
               return x;
    }
    public void traversal(TreeNode node){
if(node==null){
    return;
}
x++;
traversal(node.left);
traversal(node.right);
    }
}
