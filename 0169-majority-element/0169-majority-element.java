class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;
        int maj = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(vote == 0)maj = nums[i];

            if(nums[i] == maj)vote++;
            else vote--;
        }

        return maj;
    }
}