class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        
        for(int i=1;i<amount+1;i++){  // Creating amounts with no coins takes infinity coins
            dp[0][i] = amount+1;
        }
        
        for(int i=0;i<coins.length +1;i++){  // Creating 0 amounts with any coins is 0
            dp[i][0] = 0;
        }
        
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.min(( 1 +  dp[i][j-coins[i-1]] ), dp[i-1][j]);
                }
            }
        }
        return dp[coins.length][amount]>=(amount+1)?-1:dp[coins.length][amount];
    }
    
}











































/*
// WRONG SOLUTIONS: TLE or WRONG

// Runtime error - arrayindex out of bounds -ve infinity int
 int count = Integer.MAX_VALUE;
    int dp[];
    
    public int coinChange(int[] coins, int amount) {
        dp = new int[10002];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int result = calculate(0, amount, coins);
        return result==Integer.MAX_VALUE?-1:result;
    }
    
    int calculate(int currsum, int target, int coins[]){
        if(currsum>target){
            return Integer.MAX_VALUE;
        }
        else{
            if(dp[currsum]!=Integer.MAX_VALUE){
                return dp[currsum];
            }
            if(currsum == target){
                return 0;
            }
            else{
                int result;
                for(int i=0;i<coins.length;i++){
                    result = calculate(currsum+coins[i], target, coins);
                    if(result == Integer.MAX_VALUE);
                    else{
                        result = result + 1;
                    }
                    dp[currsum] = Math.min(dp[currsum], result);
                }
                return dp[currsum];
            }
        }
    }

















class Solution {
    
    int count = Integer.MAX_VALUE;
    int dp;
    
    public int coinChange(int[] coins, int amount) {
        dp = new int[Integer.MAX_VALUE * coins.length];
        
        calculate(0, amount, coins, 0);
        return count==Integer.MAX_VALUE?-1:count;
    }
    
    void calculate(int currsum, int target, int coins[], int index){
        if(currsum > target){
            return;
        }
        
        else{
            
            if(currsum == target){
                if(count>index){
                    count=index;
                    return;
                }
            }
            
            for(int i=0;i<coins.length;i++){
                calculate(currsum + coins[i], target, coins, index+1);
            }
        }
    }
}


*/
