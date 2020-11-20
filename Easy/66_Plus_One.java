class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i] == 9) c++;
        }
        if(c==digits.length){
            int arr[] = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
        int sum =0, carry =1;
        for(int i=digits.length-1;i>=0;i--){
            sum = digits[i] + carry;
            carry = sum/10;
            sum = sum%10;
            digits[i]=sum;
        }
        return digits;
    }
}
