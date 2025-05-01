class Solution {
    public int helper(int[] nums,int k){
        int n = nums.length;
        int l = 0, r = 0,count = 0,subarrays = 0;

        while(r < n){
            count += nums[r];

            while(count > k){
                count -= nums[l];
                l++;
            }

            subarrays += (r-l+1);
            r++;
        }

        return subarrays;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 != 0)nums[i] = 1;
            else nums[i] = 0;
        }

        return helper(nums,k) - helper(nums,k-1);
    }
}