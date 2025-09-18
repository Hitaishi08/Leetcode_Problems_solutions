class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0,j = 0;

        while(i < n && j < n){
            if(nums[i] != val){
                i++;
            }
            else if(nums[i] == val && nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        return i;
    }
}