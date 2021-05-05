/*
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
    
    boolean sameTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        else if(root1 == null || root2 == null){
            return false;
        }
        else{
            return (root1.val == root2.val) && sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
        }
    }
    
    boolean findNode(TreeNode root, TreeNode subRoot){
        return (root != null) && ( sameTree(root, subRoot) || findNode(root.left, subRoot) || findNode(root.right, subRoot) );
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return findNode(root, subRoot);
    }
}
