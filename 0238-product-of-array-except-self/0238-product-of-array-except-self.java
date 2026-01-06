class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];

        int prod = 1;
        for(int i =0;i<nums.length;i++){
            prod = prod*nums[i];
            sufix[i] = prod;
        }

        prod = 1;
        for(int j = nums.length - 1;j>=0;j--){
            prod = prod*nums[j];
            prefix[j] = prod;
        }

        for(int i =0;i<nums.length-1;i++){
            if(i == 0){
                nums[i] = prefix[i+1];
            }else{
                nums[i] = sufix[i-1] * prefix[i+1];
            }
        }
        nums[nums.length -1] = sufix[nums.length - 2];

        return nums;
    }
}