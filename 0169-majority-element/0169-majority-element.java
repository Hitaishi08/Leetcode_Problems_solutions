class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int maxele = -1;

        for(int i = 0;i<nums.length;i++){
            if(cnt == 0){
                maxele = nums[i];
                cnt = 1;
            }else if(nums[i] != maxele)cnt--;
            else cnt++;
        }
        return maxele;
    }
}