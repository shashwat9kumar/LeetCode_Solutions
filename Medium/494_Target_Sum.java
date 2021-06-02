class Solution {
    int count = 0;
    int memo[][]; 
    
    public int findTargetSumWays(int[] nums, int target) {
        memo = new int[nums.length+1][40000];
        
        for (int[] row: memo)
            Arrays.fill(row, Integer.MIN_VALUE);
        
        return calculate(nums, 0, 0, target);
        // return memo[0][20000];
    }
    
    int calculate(int arr[], int i, int currentsum, int expectedsum){
        if(i == arr.length){
            if(currentsum == expectedsum){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(memo[i][currentsum + 20000] != Integer.MIN_VALUE){
                return memo[i][currentsum + 20000];
            }
            
            memo[i][currentsum + 20000] = calculate(arr, i+1, currentsum+arr[i], expectedsum) + calculate(arr, i+1, currentsum-arr[i], expectedsum);
            return memo[i][currentsum+20000];
        }
    }
}


// takes 496 secons of time using no memoization | 190 with memoization

