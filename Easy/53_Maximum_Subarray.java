class Solution {
// USing the Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int currentbest = nums[0], overallbest = nums[0];
        for(int i = 1 ; i<nums.length; i++){
            
            if(nums[i] > (currentbest+nums[i])) currentbest = nums[i];
            else currentbest+=nums[i];
            
            if(currentbest > overallbest) overallbest = currentbest;
        }
        return overallbest;
    }
}
