class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int lastIndexOfArr = n-1;
        int back = n-1;
        int front = 0;
        
        while(front<=back){
            if(Math.abs(nums[front])> Math.abs(nums[back])){
                arr[lastIndexOfArr--] = nums[front]*nums[front];
                front++;
            }
            else{
                arr[lastIndexOfArr--] = nums[back]*nums[back];
                back--;
            }
        }
        
        return arr;
    }
}
