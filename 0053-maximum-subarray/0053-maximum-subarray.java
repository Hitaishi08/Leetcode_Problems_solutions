class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0,right = 0;
        int sum = 0,maxsum =  Integer.MIN_VALUE  ;

        while(right < nums.length){
            sum += nums[right];

            maxsum = Math.max(sum,maxsum);

            if(sum < 0)sum = 0;
            right++;
        }

        return maxsum;
    }
}