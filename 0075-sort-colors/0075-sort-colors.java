class Solution {
    public void sortColors(int[] nums) {
        int low = 0,mid = 0,hi = nums.length - 1;

        while(mid <= hi){
            if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi] = temp;
                hi--;
            }else if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
}