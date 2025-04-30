class Solution {
    public int maxScore(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int leftsum = 0,rightsum = 0;
        int l = k-1 , r = arr.length-1;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        leftsum = sum;
        max = Math.max(sum,max);

        while(l >= 0){
            leftsum = leftsum - arr[l];
            rightsum = rightsum + arr[r];

            sum = leftsum + rightsum;

            max = Math.max(sum,max);
            l--;
            r--;
        }

        return max;
    }
}