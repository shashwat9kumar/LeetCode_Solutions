class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> arr = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        if(nums.length > 0){
            int max = nums.length;
            for(int i: nums){
                set.add(i);
            }
            // for(int i: set){
            //     System.out.println(i);
            // }
            for(int i=1;i<=max;i++){
                if(!(set.contains(i))){
                    arr.add(i);
                }
            }
            return arr;
        }
        else{
            return arr;
        }
        
    }
}
