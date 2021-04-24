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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        boolean arr[] = new boolean[1];
        arr[0] = false;
        solve(root, root, sum ,root.val, arr);
        return arr[0];
    }
    
    public void solve(TreeNode root, TreeNode marked, int targetsum, int currentsum, boolean arr[]){
        
        if(root == null){
            ;
        }
        
        else if(root.left == null && root.right == null){
            if(currentsum == targetsum){
                arr[0] = true;
                return;
            }
        }
        
//         else if(marked == root){
//             if(root.left != null){
//                 solve(root.left, marked, targetsum, currentsum+root.left.val, arr);
//             }
            
//         }
        else{
            if(root.left !=null){
                solve(root.left, marked, targetsum, currentsum+root.left.val, arr);
            }
            
            if(root.right !=null){
                solve(root.right, marked, targetsum, currentsum+root.right.val, arr);
            }
            
        }
    }
}
