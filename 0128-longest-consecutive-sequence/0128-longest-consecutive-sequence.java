class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
         Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int cnt = 1,maxcnt = 1;
        int num = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == num)continue; // handle the duplicate
            if(nums[i] == num + 1){
                cnt += 1;
            }else{
                cnt = 1;
            }
            num = nums[i];
            
            maxcnt = Math.max(maxcnt,cnt);
        }
        
        return maxcnt;
    }
}