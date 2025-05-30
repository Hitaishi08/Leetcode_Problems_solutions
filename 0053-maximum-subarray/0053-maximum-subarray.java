class Solution {
    // we will use kadane's Algorithm:
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            maxi = Math.max(maxi,sum);
            if(sum < 0)sum = 0;
        }

        return maxi;
    }
}