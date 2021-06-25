class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        
        int n = s.length();
        boolean dp[] = new boolean[n+1];
        Arrays.fill(dp, false);
        dp[n] = true;
        
        for(int i=n-1; i>= 0; i--){
            String wrd = "";
            for(int j=i; j<n; j++){
                wrd = wrd + s.charAt(j);
                if(wordSet.contains(wrd)){
                    if(dp[j+1]){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[0];
    }
}
