class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> arr = new ArrayList<Integer>();
        if(nums.length>0){
            for(int i=0;i<nums.length;i++){
                int absoluteValue = Math.abs(nums[i]);
                if(nums[absoluteValue -1] > 0){
                    nums[absoluteValue -1] = -nums[absoluteValue -1];
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i] > 0){
                    arr.add((i+1));
                }
            }
        }
        return arr;
    }
}

        // Set<Integer> set = new HashSet<Integer>();
        // if(nums.length > 0){
        //     int max = nums.length;
        //     for(int i: nums){
        //         set.add(i);
        //     }
        //     // for(int i: set){
        //     //     System.out.println(i);
        //     // }
        //     for(int i=1;i<=max;i++){
        //         if(!(set.contains(i))){
        //             arr.add(i);
        //         }
        //     }
        //     return arr;
        // }
        // else{
        //     return arr;
        // }
