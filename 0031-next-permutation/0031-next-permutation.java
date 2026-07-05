class Solution {
    public void reverse(int[] nums,int s,int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length - 1;

        for(int i = n;i>0;i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }

        if(pivot == -1){
            reverse(nums,0,n);
            return;
        }

        // find the first greater element than the pivot element
        int index = -1;

        for(int i = n;i>=0;i--){
            if(nums[i] > nums[pivot]){
                index = i;
                break;
            }
        }

        // swap the elements
        int temp = nums[pivot];
        nums[pivot] = nums[index];
        nums[index] = temp;

        int i = pivot + 1;
        int j = n;

        reverse(nums,i,j);

    }
}