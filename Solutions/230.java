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
    private List<Integer> l = new ArrayList<>();
    
    private void inordertraversal(TreeNode root) {
        if(root != null){
            inordertraversal(root.left);
            l.add(root.val);
            inordertraversal(root.right);  
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        inordertraversal(root);
        return l.get(k-1);
    }
}
