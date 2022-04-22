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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val); 
        if(root == null){
            return node;
        }
        TreeNode current = root;
        while(current != null){
            if(current.val <= val){
                if(current.right == null){
                    current.right = node;
                    break;
                }
                current = current.right;
            }else{
                if(current.left == null){
                    current.left = node;
                    break;
                }
                current = current.left;
            }
        }
        
        return root;
    }
}