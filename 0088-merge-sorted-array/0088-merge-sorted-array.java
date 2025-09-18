class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)return;
        if(m == 0){
            for(int i =0;i<nums2.length;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int[] arr = new int[nums1.length];

        int i = 0,j=0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        for(i = 0;i<arr.length;i++){
            nums1[i] = arr[i];
        }
    }
}