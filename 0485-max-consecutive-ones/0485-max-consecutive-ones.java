class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcnt = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            count += nums[i];
            maxcnt = Math.max(count,maxcnt);
            
            if(nums[i] == 0){
                count = 0;
            }
        }

        return maxcnt;
    }
}