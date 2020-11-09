class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==0) return "";
        String pre = strs[0];
        for(int i=1;i<n;i++){
            int len = pre.length();
            while(!(strs[i].startsWith(pre))){
                len--;
                pre = pre.substring(0,len);
            }
            if(pre.equals("")) return "";
        }
        return pre;
    }
}
