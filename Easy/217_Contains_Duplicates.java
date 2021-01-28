class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
         
}

/*

Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
*/

/*

HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            Integer val = hm.get(nums[i]);
            if(val == null){
                hm.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
        
*/

