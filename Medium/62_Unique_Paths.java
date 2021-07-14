class Solution {
    public int uniquePaths(int m, int n) {
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        
        for(int j=0;j<m-1;j++){ // going for m-1 times because array is already filled with 1 for the first time
            for(int i=1;i<n;i++){
                dp[i] = dp[i]+ dp[i-1];
            }
        }
        return dp[n-1]; 
    }
}
