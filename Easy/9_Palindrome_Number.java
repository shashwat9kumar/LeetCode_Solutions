class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        int n = 0;
        int temp = x;
        while(temp > 0){
            temp/=10;
            n++;
        }
        int arr[] = new int[n];
        int loc = n-1;
        temp = x;
        while(temp > 0){
            arr[loc--] = temp%10;
            temp/=10;
        }
        for(int i=0;i<n/2;i++){
            if(arr[i] != arr[n-1-i]){
                return false;
            }
        }
        return true;
    }
}
