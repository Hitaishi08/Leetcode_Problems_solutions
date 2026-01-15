class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0,j=0,p=0;
        int[] ans = new int[m+n];

        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                ans[p] = nums1[i];
                i++;
            }else{
                ans[p] = nums2[j];
                j++;
            }
            p++;
        }

        while(i < m){
            ans[p] = nums1[i];
            i++;
            p++;
        }

        while(j < n){
            ans[p] = nums2[j];
            j++;
            p++;
        }

        for(i = 0;i<n+m;i++){
            nums1[i] = ans[i];
        }
    }
}