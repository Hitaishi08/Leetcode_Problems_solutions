class Solution {
    public int longestSubarray(int[] nums) {
        int sum = 0,count = 0;
        int i = 0,j=0,n=nums.length;
        int maxans = Integer.MIN_VALUE;

        while(j < n){
            sum += nums[j];
            if(nums[j] == 0)count++;
            if(count > 1){
                if(nums[i] == 0)count--;
                sum -= nums[i];
                i++;
            }

            maxans = Math.max(sum,maxans);
            j++;
        }

        return (count != 0) ? maxans : maxans - 1;
    }
}