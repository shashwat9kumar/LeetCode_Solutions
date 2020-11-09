class Solution {
    public boolean isValid(String s) {
        char arr[] = new char[100000];
        int top = -1;
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(top == -1){
                arr[++top] = ch;
            }
            else{
                if(ch == ']' || ch == '}' || ch == ')'){
                    if(arr[top] == map.get(ch)){
                        top--;
                    }
                    else{
                        arr[++top] = ch;
                    }
                }
                else{
                    arr[++top] = ch;
                }
            }
        }
        if(top>-1){
            return false;
        }
        else{
            return true;
        }
        
    }
}
