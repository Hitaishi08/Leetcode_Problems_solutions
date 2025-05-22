class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major_ele = 0;

        for(int i = 0;i<nums.length;i++){
            if(count == 0)major_ele = nums[i];
            if(major_ele == nums[i])count++;
            else count--;
        }

        return major_ele;
    }
}