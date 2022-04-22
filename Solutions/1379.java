/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode res = null;
    private void inorderTraversal(TreeNode root, int targetValue){
        if(root != null){
            inorderTraversal(root.left, targetValue);
            if(root.val == targetValue){
                res = root;
            }
            inorderTraversal(root.right, targetValue);
        }
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorderTraversal(cloned, target.val);
        return res;
    }
}