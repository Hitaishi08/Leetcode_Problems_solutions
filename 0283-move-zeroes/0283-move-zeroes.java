class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1)return;

        int i = 0,j = 0;

        while(j  < n){
           if(nums[i] != 0){
            i++;
            j++;
            continue;
           } 

           if(nums[j] != 0){
            nums[i] = nums[j];
            nums[j] = 0;
            i++;
           }
           j++;
        }                                             
    }
}