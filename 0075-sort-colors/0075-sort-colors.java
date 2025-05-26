class Solution {
    public void sortColors(int[] nums) {
        int zero = 0,ones = 0,two = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] == 0)zero++;
            if(nums[i] == 1)ones++;
            else two++;
        }

        for(int i = 0;i<n;i++){
            if(zero > 0){
                nums[i] = 0;
                zero--;
            }else if(ones > 0){
                nums[i] = 1;
                ones--;
            }else{
                nums[i] = 2;
                two--;
            }
        }

    }
}