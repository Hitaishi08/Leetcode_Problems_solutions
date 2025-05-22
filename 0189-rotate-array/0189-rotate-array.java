class Solution {
    public void helper(int[] arr){
        int num = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = num;
    }

    public void reverse(int[] nums , int start , int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;  

        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        // will you TLE
        // for(int i = 0; i < k; i++){
        //     helper(nums);
        // }

    }
}