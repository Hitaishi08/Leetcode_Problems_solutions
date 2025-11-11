class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int maxlen = 0;
        int xor = nums[0];

        for(int i=1;i<n;i++){
            xor ^= nums[i];
            System.out.println(xor);
        }
        
        if(xor != 0)return n;
        
        for(int i=0;i<n;i++){
            if((xor ^ nums[i]) != 0){
                maxlen = n - 1;
                break;
            }
        }


        return maxlen;
    }
}