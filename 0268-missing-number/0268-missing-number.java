class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int miss = -1;
        for(int i = 0;i<n;i++){
            if(i!=nums[i]){
                miss = i;
                break;
            }
        }

        return (miss != -1) ? miss : n;
    }
}