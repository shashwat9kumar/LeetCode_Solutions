class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length == 0) return false;
        
        // check if sum is oddd or even
        
        int sum =0;
        for(int x: nums){
            sum+=x;
        }
        
        if(sum%2 != 0) return false;
        
        // Now if even, using subset sum partition problem using dp
        sum = sum/2; // sum we're trying to find
        
        boolean dp[][] = new boolean[nums.length+1][sum+1];
        
        int n= nums.length; 
        
        for(int i=0;i<sum+1;i++){
            dp[0][i] = false; // no sum can be formed using 0 elements
        }
        for(int i=0;i<n+1;i++){
            dp[i][0] = true; // 0 sum can be formed using all elements
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                // Include condition
                boolean include = (nums[i-1]<=j) && (dp[i-1][j-nums[i-1]]);
                
                // exclude condition
                boolean exclude = dp[i-1][j];
                
                dp[i][j] = include || exclude;
            }
        }
        
        return dp[n][sum];
        
    }
}
