class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ele = 0;
        for(int i = 0;i<nums.length;i += 3){
            if(i == nums.length -1 || nums[i] != nums[i+2]){
                ele = nums[i];
                break;
            }
        }
        return ele;
    }
}