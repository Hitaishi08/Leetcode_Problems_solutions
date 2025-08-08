class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0 , j = 0,n = nums.length;
        int cnt = 0;
        int maxlen = 0;

        while(j < n){
            if(nums[j] == 0)cnt++;

            while(cnt > k){
                if(nums[i] == 0)cnt--;
                i++;
            }

            if(cnt <= k){
                maxlen = Math.max(maxlen,j - i + 1);
            }
            j++;
        }

        return maxlen;
    }
}