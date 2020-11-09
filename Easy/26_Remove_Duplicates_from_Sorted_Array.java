class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0 || arr.length==1) return arr.length;
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j]!= arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
