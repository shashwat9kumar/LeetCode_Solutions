class Solution {
    // Bit manipulation:
    // two sam no. when XORed together give 0
    // Any number when XORed with 0 give that number 
    // a(xor)b(xor)a = a(xor)a(xor)b
    
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i: nums){
            a = a^i;
        }
        return a;
    }
}

        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        // }
        // int returnValue = 0;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     int key = entry.getKey();
        //     int value = entry.getValue();
        //     // System.out.println(key + " "+ value);
        //     if(value != 2){
        //         returnValue = key;
        //         break;
        //     }
        // }
        // return returnValue;
