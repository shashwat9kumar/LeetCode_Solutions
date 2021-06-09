class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        
        dp[0] = 1;
        int global_max = 1;
        
        for(int i=1;i<nums.length;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(dp[i]>global_max){
                global_max = dp[i];
            }
        }
        
        return global_max;
    }
}



/*
// 58ms runtime

    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        
        dp[0] = 1;
        int global_max = 1;
        
        for(int i=1;i<nums.length;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(dp[i]>global_max){
                global_max = dp[i];
            }
        }
        
        return global_max;
    }
    
    
    
    
//   1251 ms runtime

    public int lengthOfLIS(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        map.put(1, nums[0]);
        
        for(int i=1;i<nums.length; i++){
            int currentSubsequenceLength = 1;
            for(Map.Entry<Integer, Integer> e: map.entrySet()){
                if(e.getValue()<nums[i]){
                    if(e.getKey()>= currentSubsequenceLength){
                        currentSubsequenceLength = e.getKey() + 1;
                    }
                }
                
                if(map.containsKey(currentSubsequenceLength)){
                    map.put(currentSubsequenceLength, Math.min(map.get(currentSubsequenceLength), nums[i]));
                }
                else{
                    map.put(currentSubsequenceLength, nums[i]);
                }
            }
        }
        
        return map.lastKey();
    }



*/
