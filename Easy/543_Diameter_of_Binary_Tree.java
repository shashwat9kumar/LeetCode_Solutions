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
    
    
    
//     Height of a null tree is -1
//     Height of a tree of level 1 is 0 and so on..
    
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        int height = calculate(root);
        return max;
    }
    
    int calculate(TreeNode root){ 
        if(root == null){
            return 0;
        }
        int l = calculate(root.left);
        int r = calculate(root.right);
        int height = 1 +  Math.max(l, r);
        int diameter = l + r;
        if(diameter > max){
            max=diameter;
        }
        return height;
    }
    
    
}
