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
class Solution {
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