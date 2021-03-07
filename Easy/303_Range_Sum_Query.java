class NumArray {
    private int nums[];
    private Map<Integer, Integer> map = new HashMap<>();
    public NumArray(int[] nums) {
        this.nums = nums;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            map.put(i, sum);
        }
    }
    
    public int sumRange(int i, int j) {
        return (map.get(j) - map.get(i) + nums[i]);
    }
}


// class NumArray {
//     private Map<Integer, Integer> map = new HashMap<>();
//     public NumArray(int[] nums) {
//         int sum =0;
//         map.put(0,0);
//         for(int i=0;i<nums.length;i++){
//             sum += nums[i];
//             map.put(i+1, sum);
//         }
//     }
    
//     public int sumRange(int i, int j) {
//         return (map.get(j+1) - map.get(i));
//     }
// }




//     private int nums[];
//     public NumArray(int[] nums) {
//         this.nums = nums;
//     }
    
//     public int sumRange(int i, int j) {
//         int sum = 0;
//         for(int x=i;x<=j;x++){
//             sum += nums[x];
//         }
//         return sum;
//     }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
