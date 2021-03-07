class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        if(n<2){ return 0;}
        
        int x=0;
        int y=1;
        int sval=prices[x];
        int max=0;
        while(y<n){
            int diff = prices[y] -prices[x];
            if(max<diff){
                max=diff;
            }
            if(prices[y]<sval){
                sval=prices[y];
                x=y;
                y=x;
            }
            y++;
        }
        return max;
    }
}



        // EXCEDED TIME LIMIT

        // int n= prices.length;
        // int max = 0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int diff = prices[j] - prices[i];
        //         if(diff > max){
        //             max=diff;
        //         }
        //     }
        // }
        // return max;
