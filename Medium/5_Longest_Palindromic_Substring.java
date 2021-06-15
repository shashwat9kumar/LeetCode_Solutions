class Solution {
    
    int longestStart = 0;
    int longestLength = 0;
    
    public String longestPalindrome(String s) {
        if(s.length() <=1 ){
            return s;
        }
        int n = s.length();
        for(int i=0;i<n-1;i++){
            checkPalindrome(s, i, i, n);
            checkPalindrome(s, i, i+1, n);
        }
        
        return s.substring(longestStart, longestStart+longestLength);
        
    }

    
    void checkPalindrome(String s, int start, int end, int n){
        while((start>=0 && end<n) && (s.charAt(start) == s.charAt(end))){
            start--;
            end++;
        }
        
        if(longestLength < end-start-1){
            longestStart = start + 1;
            longestLength = end-start-1;
        }
    }
}
