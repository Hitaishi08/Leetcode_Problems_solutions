class Solution {
    public int missingNumber(int[] nums) {
        int Asum = 0;
        int Bsum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            Bsum += (i+1);
            Asum += nums[i];
        }

        return Bsum - Asum;
    }
}