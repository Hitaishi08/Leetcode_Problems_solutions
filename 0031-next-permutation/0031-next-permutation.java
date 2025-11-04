class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        // step 1: find the pivote : nums[i] < nums[i+1]
        int pivot = -1;

        for(int i = nums.length - 1;i>0;i--){
            if(nums[i] > nums[i - 1]){
                pivot = i-1;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums,0,nums.length-1);
            return;
        }

        // step 2 : find the smallest larger number than pivot (after the pivot index)

        int SwapIndex = 0;
        for(int i = nums.length-1;i>pivot;i--){
            if(nums[i] > nums[pivot]){
                SwapIndex = i;
                break;
            }
        }
        // step 3: swap the pivot and the SwapNum
        int temp = nums[pivot];
        nums[pivot] = nums[SwapIndex];
        nums[SwapIndex] = temp;

        // reverse the portion after the pivot 
        reverse(nums,pivot+1,nums.length - 1);
    }
}