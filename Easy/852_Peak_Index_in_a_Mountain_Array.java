class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lb=0, ub=arr.length-2;
        while(lb<=ub){
            int m=(lb+ub)/2;
            if(arr[m]<arr[m+1]){
                lb=m+1;
            }
            else{
                ub=m-1;
            }
        }
        return lb;
    }
}



        // int target = 0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>arr[target]){
        //         target = i;
        //     }
        //     else{
        //         return target;
        //     }
        // }
        // return 0;
