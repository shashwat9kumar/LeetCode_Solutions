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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    boolean isMirror(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        else if(p.val != q.val) {
            return false;
        }
        else {
            boolean val = isMirror(p.left, q.right) && isMirror(p.right, q.left);
            return val;
        }
    }
}
