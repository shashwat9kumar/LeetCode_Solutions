class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        
        dp[0] = 1;
        
        for(int i=1;i<=target;i++){
            int tempsum = 0;
            for(int j: nums){
                tempsum += ( (i-j)<0?0:dp[i-j] );
            }
            dp[i] = tempsum;
        }
        return dp[target];
    }
}
