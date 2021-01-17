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
    int ps = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length -1);
    }
    
    
    TreeNode solve(int preorder[], int inorder[], int is, int ie) {
        if(is>ie){
            return null;
        }
        
        
        TreeNode node = new TreeNode(preorder[ps++]);
        int inoIndex = index(inorder, node.val);
        
        node.left = solve(preorder, inorder, is, inoIndex -1);
        node.right = solve(preorder, inorder, inoIndex + 1, ie);
        
        return node;
    }
    
    
    int index(int arr[], int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val) return i;
        }
        return -1;
    }
}
