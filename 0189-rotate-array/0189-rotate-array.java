class Solution {
    public void reverse(int[] nums,int s , int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length ;

        if(k == n)return; // the array will remain same 

        // simplifying the k
        if(k > nums.length){
            k = k % nums.length;
        }
      
        // reversing the array in parts
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}