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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return findDepth(root);
    }
    
    public int findDepth(TreeNode root) {
        if (root == null) return 0;
        int l = findDepth(root.left);
        int r = findDepth(root.right);
        
        return Math.max(l, r) + 1;
    }
}