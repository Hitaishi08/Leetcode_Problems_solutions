class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int len = (int)Math.floor(Math.log10(nums[i])) + 1;
            if((len&1) == 0)count++;
        }
        return count;
    }
}