class Solution {
    // when to find the max sum of subarray.
    // we gonna use the kadane's algorithm.

    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            maxsum = Math.max(maxsum,sum);

            if(sum < 0)sum = 0;

        }
        return maxsum;
    }
}