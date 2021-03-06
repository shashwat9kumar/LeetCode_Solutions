class Solution {
    
    int arr[] = new int[46];
    public int climbStairs(int n) {
        if(n<0) return 0;
        if (n==0) return 1;
        if (arr[n] > 0) return arr[n];
        else{
            arr[n] =  ( climbStairs(n-2) + climbStairs(n-1) );
            return arr[n];
        }
    }
}
