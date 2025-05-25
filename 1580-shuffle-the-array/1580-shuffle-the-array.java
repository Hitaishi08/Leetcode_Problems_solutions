class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a = nums.length;
        int[] ans = new int[a];
        int i = 0, j = n;

        for(int p = 0;p<a;p++){
            if(p % 2 == 0){
                ans[p] = nums[i];
                i++;
            }else{
                ans[p] = nums[j];
                j++;
            }
        }

        return ans;
    }
}