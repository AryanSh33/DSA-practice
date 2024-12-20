
class reverseOddLevels {
    public TreeNode reverseOddLevels(TreeNode root) {
        lvlTraverse(root.right,root.left,0);
        return root;
    }
    public void lvlTraverse(TreeNode n1,TreeNode n2,int level){
        if(n1==null || n2==null){      //if root value is null return;
            return;
        }
        if(level%2==0){           //check for even level
            int temp=n1.val;   
            n1.val=n2.val;         //swap value for even levels
            n2.val=temp;
        }
        lvlTraverse(n1.right,n2.left,level+1); // increase level during recurssion or Traversal
        lvlTraverse(n1.left,n2.right,level+1);
    }
}
