class Solution {
    public boolean check(int[] nums) {
        int cnt = 1;
        
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] > nums[i+1])cnt--;
            if(cnt < 0)return false;
        }

        if(nums[nums.length - 1] > nums[0])cnt--;

        return (cnt < 0) ? false : true;
        
    }
}