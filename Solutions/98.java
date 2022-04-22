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
    private long LastValue = Long.MIN_VALUE;
    private boolean Indicator = true;
    private void inorderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        if(node.val <= LastValue){
            Indicator = false;
        }else{
            LastValue = node.val;
        }
        inorderTraversal(node.right);
    }
    
    public boolean isValidBST(TreeNode root) {
        inorderTraversal(root);
        return Indicator;
    }
}
