class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum += (i+1);
            sum2 += nums[i];
        }

        return sum - sum2;
    }
}