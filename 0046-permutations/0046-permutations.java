class Solution {
    public void swap(int nums[],int i,int j){
         int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void solve(int i,int[] nums,List<List<Integer>> ans){
        if(i == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int k = 0;k<nums.length;k++){
                list.add(nums[k]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int j = i;j<nums.length;j++){
            swap(nums,i,j);
            solve(i+1,nums,ans);
            swap(nums,i,j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums,ans);
        return ans;
    }
}