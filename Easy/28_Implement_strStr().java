class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        if(haystack.equals("")) return -1;
        
        int len = haystack.length();
        int n = needle.length();
        
        for(int i=0;i<len-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)) return i;
        }
        return -1;
    }
}
