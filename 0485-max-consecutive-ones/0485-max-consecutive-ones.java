class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r = 0,l=0;
        int count = 0;
        int len = 0;
        while(r < nums.length){
            if(nums[r] == 0)count++;

            while(count >= 1){
                if(nums[l] == 0)count--;
                l++;
            }

            len = Math.max(r - l + 1,len);
            r++;
        }
        return len;
    }
}