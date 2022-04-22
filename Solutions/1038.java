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
    List<TreeNode> l = new ArrayList<>();
    public void inorderTraversal(TreeNode node){
        if (node == null){
            return;
        }
        inorderTraversal(node.left);
        l.add(node); 
        inorderTraversal(node.right);
   }
    
    public TreeNode bstToGst(TreeNode root) {
        inorderTraversal(root);
        for(int i = l.size()-2;i >= 0;i--){
            l.get(i).val += l.get(i+1).val;
        }
    return root;
    }
}