class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone = 0;
        int one = 0;

        for(int i= 0;i<nums.length;i++){
            one += nums[i];

            if(nums[i] == 0){
                one = 0;
            }

            maxone = Math.max(one,maxone);
        }
        return maxone;
    }
}