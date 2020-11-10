class Solution {
    public int removeElement(int[] nums, int val) {
        int i=nums.length-1, j=0;
        while(i>=j){
            if(nums[j] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i--;
            }
            else j++;
        }
        return (i+1);
    }
}
