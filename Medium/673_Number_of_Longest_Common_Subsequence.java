class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        int n = nums.length;
        int len[] = new int[n];
        int count[] = new int[n];
        
        Arrays.fill(len, 1);
        Arrays.fill(count, 1);
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j] && len[i]<len[j]+1){
                    len[i] = len[j] + 1;
                    count[i] = count[j];
                }
                else if(nums[i] > nums[j] && len[i]==len[j]+1){
                    len[i] = len[j] + 1;
                    count[i] = count[j] + count[i];
                }
            }
        }
        
        int max = 1;
        for(int i=0;i<n;i++){
            if(len[i] > max){
                max = len[i];
            }
        }
        System.out.println(max);
        
        int num = 0;
        for(int i=0;i<n;i++){
            if(len[i] == max){
                num = num + count[i];
            }
        }
        System.out.println(num);
        return num;
    }
}
