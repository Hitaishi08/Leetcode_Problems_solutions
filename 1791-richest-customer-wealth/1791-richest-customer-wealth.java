class Solution {
    public int helper(int[] arr){
        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int maxsum = Integer.MIN_VALUE;
        int n = accounts.length;

        for(int i = 0;i<n;i++){
            maxsum = Math.max(helper(accounts[i]),maxsum);
        }

        return maxsum;
    }
}