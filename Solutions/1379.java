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
    
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		if (original == null || original == target){
			return cloned;
        }
		res = getTargetCopy(original.left, cloned.left, target);
		if (res != null){
			return res;
        }
		res = getTargetCopy(original.right, cloned.right, target);

        return res;
	}
}