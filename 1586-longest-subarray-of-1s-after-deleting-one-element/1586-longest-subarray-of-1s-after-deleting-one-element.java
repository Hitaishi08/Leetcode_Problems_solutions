class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0,count = 0,maxlen = 0;

        while(r < n){
            if(nums[r] == 0)count++;

            while(count > 1){
                if(nums[l] == 0)count--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l);
            r++;
        }
        return maxlen;
    }
}