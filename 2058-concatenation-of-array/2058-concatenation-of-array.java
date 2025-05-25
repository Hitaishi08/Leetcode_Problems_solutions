class Solution {
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int n = nums.length * 2;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = nums[i%a];
        }

        return arr;
    }
}