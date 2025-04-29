class Solution {
    public int maxelemet(int[] num){
        int n = num.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            max = Math.max(max,num[i]);
        }
        return max;
    }
    public long helper(int[] nums,int k){
        int maxele = maxelemet(nums);
        int n = nums.length;

        int l = 0,r=0;
        int count = 0;
        long max = 0;
        while(r < n && l < n){
            if(nums[r] == maxele)count++;

            while(count >= k){
                if(nums[l] == maxele)count-=1;
                max += n - r;
                l++;
            }
            r++;
        }
        return max;
    }
    public long countSubarrays(int[] nums, int k) {
        return helper(nums,k); 
    }
}