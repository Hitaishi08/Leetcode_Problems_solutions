class Solution {
    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    // 2nd method is to use the "Dutch National Flag Algorithm"
    public void sortColors(int[] nums) {
        int low = 0, curr = 0, high = nums.length-1;
        int n = nums.length;

        while(curr <= high){
            if(nums[curr] == 0){
                swap(nums,low,curr);
                low++;
                curr++;
            }else if(nums[curr] == 2){
                swap(nums,high,curr);
                high--;
            }else{
                curr++;
            }
        }                                   
    }
}