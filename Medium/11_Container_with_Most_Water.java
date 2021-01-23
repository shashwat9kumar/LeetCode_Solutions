class Solution {
    
    public int maxArea(int[] height) {  // following a 2 pointer approach
                                        // Brute force method: 2 for loops. Area of all containers.
        
        int maxArea = 0, left = 0, right = height.length -1;
        
        while(left<right){
            int smaller = height[left]<height[right]?left:right;
            int proposedArea = (right-left)*(height[smaller]);
            
            maxArea = Math.max(maxArea, proposedArea);
            
            if(height[left]<height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
        
    }
}
