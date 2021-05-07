class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) !=i){
                return (new int[] {i, map.get(complement)});
            }
            map.put(nums[i],i);
        }/*
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) !=i){
                return (new int[] {i, map.get(complement)});
            }
        }*/
        throw new IllegalArgumentException("No two sum solution");
    }
}

/*


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}


*/
