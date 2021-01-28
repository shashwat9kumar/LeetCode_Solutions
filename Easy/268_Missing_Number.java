class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length+1; 
        int sum = (n*(n-1))/2;
        int found = 0;
        
        for(int x : nums) {
            found += x;
        }
        
        return sum - found;
    }
}

/*


int arr[] = new int[nums.length+1];
        Arrays.fill(arr,0);
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = 1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
        
        
*/
