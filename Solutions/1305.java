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
    
    private void inorderTraversal(TreeNode root){
        if(root != null){
            inorderTraversal(root.left);
            l.add(root.val);        
            inorderTraversal(root.right);  
        }
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorderTraversal(root1);
        inorderTraversal(root2);
        Collections.sort(l);
        return l;
    }
}