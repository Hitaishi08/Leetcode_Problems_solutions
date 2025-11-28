class Solution {
    public int solve(int[] nums,int i,int[] dp){
        if (i < 0) return 0;
        if(dp[i] != -1)return dp[i];

        int include = nums[i] + solve(nums, i - 2,dp);
        int exclude = solve(nums, i - 1,dp);

        dp[i] = Math.max(include, exclude);
        return dp[i];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums, nums.length - 1,dp);
    }
}