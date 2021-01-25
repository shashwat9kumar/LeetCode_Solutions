class Solution {
    public void rotate(int[][] m) {
        
        int n = m.length;
        int l=0,r=n-1;
        
        while(l<r){
            
            for(int i=0;i<(r-l);i++){
                int t=l, b= r;
                
                int topleft = m[t][l+i];
                
                m[t][l+i] = m[b-i][l];
                
                m[b-i][l] = m[b][r-i];
                
                m[b][r-i] = m[t+i][r];
                
                m[t+i][r] = topleft;
            }
            l++;
            r--;
        }
        
        
    }
}
