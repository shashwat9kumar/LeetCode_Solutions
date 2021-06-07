class Solution {
    public int max(int a, int b, int c){
        return a>b?(a>c?a:c):(b>c?b:c);
    }
    
    public int min(int a, int b, int c){
        return a<b?(a<c?a:c):(b<c?b:c);
    }
    
    public int maxProduct(int[] nums) {
        int global_max = nums[0];
        int max_till_prev = nums[0];
        int min_till_prev = nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            int max_found_so_far = max(nums[i], nums[i]*max_till_prev, nums[i]*min_till_prev);
            int min_found_so_far = min(nums[i], nums[i]*max_till_prev, nums[i]*min_till_prev);
            
            if(global_max<max_found_so_far){
                global_max = max_found_so_far;
            }
            
            max_till_prev = max_found_so_far;
            min_till_prev = min_found_so_far;
        }
        
        return global_max;
    }
}
