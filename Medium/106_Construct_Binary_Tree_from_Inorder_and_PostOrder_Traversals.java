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
    int pe;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        pe = postorder.length -1;
        return solve(postorder, inorder, 0, inorder.length -1);
    }
    
    TreeNode solve(int postorder[], int inorder[], int is, int ie) {
        if(is>ie){
            return null;
        }
        
        
        TreeNode node = new TreeNode(postorder[pe--]);
        int inoIndex = map.get(node.val);
        
        node.right = solve(postorder, inorder, inoIndex + 1, ie);
        node.left = solve(postorder, inorder, is, inoIndex -1);
        
        
        return node;
    }
}
