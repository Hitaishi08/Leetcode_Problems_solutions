class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int prod = 1;

        int r = 0,l = 0;

        while(r < nums.length){
            prod *= nums[r];

            while(prod > k){
                prod = prod/nums[l];
                l++;
            }

            count += r - l + 1;
            r++;
        }

        return count;
    }
}