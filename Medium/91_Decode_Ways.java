class Solution {
    public int numDecodings(String s) {
        
        if(s.length() == 0 || s.charAt(0)=='0') return 0;
        
        if(s.length() == 1) return 1;
        
        
        // At any point in time, we are only concerned with the ways
        // at i-1 and at i-2 so we do not need an entire DP array, 
        // but just 2 counter variables
        
        
        int count_i_2 = 1,  // count at i-2 (initializing it to 1 because even if the 
                            // second digit follows case 1, it will only add 1 )
            count_i_1 = 1;  // count at i-1
        
        
        int count = 0;
        for(int i=1;i<s.length();i++){
            int d = s.charAt(i) - '0';
            int number_dd =(s.charAt(i-1)-'0')*10 + (d);
            if(d!=0){
                if(number_dd>=10 && number_dd<=26){
                    count = count_i_1 + count_i_2;
                }
                else{
                    count = count_i_1;
                }
            }
            else{
                if(number_dd>=10 && number_dd<=26){
                    count = count_i_2;
                }
                else{
                    return 0;
                }
            }
           
           count_i_2 =  count_i_1;
           count_i_1 = count;
        }
        
        return count;
    }
}
