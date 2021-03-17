class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lb=0, ub=letters.length-1,mid=0;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(letters[mid]<=target){
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }
        return (letters[lb % letters.length]);
    }
}
