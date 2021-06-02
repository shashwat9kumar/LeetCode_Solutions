class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        else{
            int maxSumTillThatHouse[] = new int[nums.length];
            maxSumTillThatHouse[0] = nums[0];
            maxSumTillThatHouse[1] = Math.max(nums[0], nums[1]);
            
            for(int i=2;i<nums.length;i++){
                maxSumTillThatHouse[i] = Math.max(( nums[i] + maxSumTillThatHouse[i-2] ), maxSumTillThatHouse[i-1]);
            }
            
            return maxSumTillThatHouse[nums.length -1];
        }
    }
}
