//1448. Count Good Nodes in Binary Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class goodNodes {
    public int goodNodes(TreeNode root) { 
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root,int l){
        if(root==null){
            return 0;
        }
        l=Math.max(root.val,l);
       if(root.val>=l){
         return 1+ dfs(root.left,l)+dfs(root.right,l);
    }
    else{
        return dfs(root.left,l)+dfs(root.right,l);
    }
    
}}
