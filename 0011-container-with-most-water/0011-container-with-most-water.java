class Solution {
    public int maxArea(int[] height) {
        int i = 0,j= height.length - 1;

        int maxwater = Integer.MIN_VALUE;

        while(i < j){
            int water = Math.min(height[i],height[j]) * (j - i);

            if(height[i] > height[j])j--;
            else i++;

            maxwater = Math.max(maxwater,water);
        }
        
        return maxwater;
    }

}