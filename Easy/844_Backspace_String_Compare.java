class Solution {
    public boolean backspaceCompare(String s, String t) {
        return createString(s).equals(createString(t));
    }
    
    String createString(String s){
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }
            else if(!(stack.isEmpty())){
                stack.pop();
            }
        }
        
        return stack.toString();
    }
}
