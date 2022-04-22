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

    private int sum = 0;
    
    private void InorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        InorderTraversal(root.left);
        if(root.val%2 == 0 && root.right != null){
            if(root.right.right != null){
                sum += root.right.right.val;
            }
            if(root.right.left != null){
                sum += root.right.left.val;
            }
        }
        if(root.val%2 == 0 && root.left != null){
           if(root.left.right != null){
                sum += root.left.right.val;
            }
            if(root.left.left != null){
                sum += root.left.left.val;
            } 
        }
        InorderTraversal(root.right);
    }
    
        
    public int sumEvenGrandparent(TreeNode root) {
        InorderTraversal(root);
        return sum;
    }
    
    
}