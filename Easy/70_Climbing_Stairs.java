// class Solution {
    
//     int arr[] = new int[46];
//     public int climbStairs(int n) {
//         if(n<0) return 0;
//         if (n==0) return 1;
//         if (arr[n] > 0) return arr[n];
//         else{
//             arr[n] =  ( climbStairs(n-2) + climbStairs(n-1) );
//             return arr[n];
//         }
//     }
// }


class Solution {
    
    public int climbStairs(int n) {
        if(n==1) return 1;
        int arr[] = new int[n+1];
        
        arr[1] = 1;
        arr[2] = 2;
        
        
        for(int i=3;i<=n;i++){
            arr[i]= arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
