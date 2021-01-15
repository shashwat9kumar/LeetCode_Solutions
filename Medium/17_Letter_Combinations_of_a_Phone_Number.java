class Solution {
    
    String arr[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> list = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        
        
        if (digits.length() ==0) {
            return list;
        }
        solve(digits, "");
        return list;
        //return (String)(list.toArray());
    }
    
    void solve(String digits, String adder) {
        int len = digits.length();
        if(len == 0) {
            list.add(adder);
        }
        else {
            int num = digits.charAt(0) - 50;
            String values = arr[num];
            String newDigits = digits.substring(1);
            for(int i=0;i<values.length();i++) {
                String temp = adder + values.charAt(i);
                solve(newDigits, temp);
            }
        }
    }
}
