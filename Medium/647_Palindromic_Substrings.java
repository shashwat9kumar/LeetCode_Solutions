class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int totalCount = 0;
        for(int i=0;i<n;i++){
            totalCount += checkPalindrome(s, i, i, n);
            if(i<n-1){
               totalCount += checkPalindrome(s, i, i+1, n); 
            }
        }
        return totalCount;
    }
    
    int checkPalindrome(String s, int start, int end, int n){
        int count = 0;
        while((start >=0 && end<n) && (s.charAt(start) == s.charAt(end))){
            count++;
            start--;
            end++;
        }
        return count;
    }
}
