class Solution {
    public boolean check(int[] nums) {
        int count = 0;

        int i = 0;

        while(i < nums.length){
            if(nums[i] > nums[(i+1) % nums.length])count++;

            if(count > 1)return false;
            i++;
        }

        return true;
    }
}