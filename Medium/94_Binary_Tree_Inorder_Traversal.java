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
    List<Integer> arr = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        solve(root);
        return arr;
    }
    
    void solve(TreeNode root) {
        if(root == null ){
            return;
        }
        solve(root.left);
        arr.add(root.val);
        solve(root.right);
    }
}
