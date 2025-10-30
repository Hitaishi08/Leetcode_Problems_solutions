class Solution {
    public int singleNumber(int[] nums) {
        int ele = 0;
        for(int i = 0;i<nums.length;i++){
            ele ^= nums[i];
        }
        return ele;
    }
}