class Solution {
    public int trap(int[] height) {
        int i =0,j=height.length-1;
        int leftmax = Integer.MIN_VALUE,rightmax = Integer.MIN_VALUE;
        int total = 0;
        while(i < j){
            if(height[i] <= height[j]){
                if(leftmax > height[i]){
                    total += leftmax - height[i];
                }else{
                    leftmax = height[i];
                }
                i++;
            }else{
                if(rightmax > height[j]){
                    total += rightmax - height[j];
                }else{
                    rightmax = height[j];
                }
                j--;
            }
        }

        return total;
    }
}