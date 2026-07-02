class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0] , occ = 0;

        for(int i=0;i<nums.length;i++){
            if(occ == 0){
                ele = nums[i];
            }

            if(nums[i] == ele)occ++;
            else{
                occ--;
            }
        }

        return ele;
    }
}