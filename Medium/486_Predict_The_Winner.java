class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        
        int dp[][] = new int[n][n];
        
        // fill the dp table diagonally and then upwards and then diagonal again
        
        for(int gap = 0; gap<n; gap++){
            for(int i=0, j=gap; j<n; i++, j++){
                
                if(i==j){
                    dp[i][j] = nums[i];
                }
                else if(i+1 == j){
                    dp[i][j] =  Math.max(nums[i], nums[j]);
                }
                else{
                    dp[i][j] = Math.max(
                            nums[i] + Math.min(dp[i+2][j], dp[i+1][j-1]),
                            nums[j] + Math.min(dp[i+1][j-1], dp[i][j-2])
                    );
                }
                
            }
        }
        
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        
        int player2 = sum - dp[0][n-1];
        if(player2<=dp[0][n-1]){
            return true;
        }
        else{
            return false;
        }
        
    }
}
