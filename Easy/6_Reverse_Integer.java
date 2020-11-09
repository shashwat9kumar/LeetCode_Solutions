class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int d = x%10;
            if(rev > 214748364 || (rev == 214748364 && d > 7)){
                return 0;
            }
            if(rev < -214748364 || (rev == -214748364  && d < -8)){
                return 0;
            }
            rev=rev*10 + d;
            x=x/10;
        }
        return rev;
    }
}
