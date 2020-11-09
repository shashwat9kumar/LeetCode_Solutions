class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map  = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        int n= s.length();
        for(int i=0;i<n;){
            char ch = s.charAt(i);
            int toadd = map.get(ch);
            if(i != n-1){
                int next = map.get(s.charAt(i+1));
                if((next ==5 || next ==10) && toadd == 1 ){
                    toadd = next - toadd;
                    i++;
                }
                else if((next ==50 || next ==100) && toadd == 10 ){
                    toadd = next - toadd;
                    i++;
                }
                else if((next ==500 || next ==1000) && toadd == 100 ){
                    toadd = next - toadd;
                    i++;
                }
            }
            total = total + toadd;  
                
            i++;
        }
       return total; 
    }
}
