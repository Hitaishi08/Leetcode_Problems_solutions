class Solution {
    public int minimumCost(int[] nums) {
        int sum = 0;
        sum += nums[0];

        int first_min = Integer.MAX_VALUE,sec_min = -1;

        for(int i = 1;i<nums.length;i++){
            if(nums[i] <= first_min){
                sec_min = first_min;
                first_min = nums[i];
            }else if(nums[i] != first_min && nums[i] < sec_min){
                sec_min = nums[i];
            }
        }

        sum += first_min + sec_min;

        return sum;
    }
}