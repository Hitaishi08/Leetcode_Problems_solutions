class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone = 0;
        int one = 0;

        for(int i= 0;i<nums.length;i++){

            if(nums[i] == 1){
                one += nums[i];
                maxone = Math.max(one,maxone);
            }else{
                one = 0;
            }
            
        }
        return maxone;
    }
}