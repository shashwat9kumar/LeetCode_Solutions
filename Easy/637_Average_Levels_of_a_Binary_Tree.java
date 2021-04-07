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
    
    void sumAtEachLevel(int level, ArrayList<Double> sum, ArrayList<Integer> count, TreeNode node){
        if(node == null){
            return;
        }        
        else if((level+1)>sum.size()){
            sum.add((double)node.val);
            count.add(1);
        }
        else if((level+1)<=sum.size()){
            sum.set(level, sum.get(level)+node.val);
            count.set(level, count.get(level)+1);
        }
        sumAtEachLevel(level+1, sum, count, node.left);
        sumAtEachLevel(level+1, sum, count, node.right);
    }
    
    
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> sum = new ArrayList<Double>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        
        sumAtEachLevel(0, sum, count, root);
        
        for(int i=0;i<sum.size();i++){
            sum.set(i, (sum.get(i)/count.get(i)));
        }
        return sum;
    }
}
