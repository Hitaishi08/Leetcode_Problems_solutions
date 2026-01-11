class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0;i<n-2;i++){
            
            // skipping duplicates for the i
            if(i > 0 && nums[i] == nums[i-1])continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k){
                
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> list = new ArrayList<>();

                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    j++;
                    k--;

                    // skipping duplicates for the j:
                    while(j < k && nums[j] == nums[j-1])j++;

                    //skipping duplicates for the k:
                    while(j < k && nums[k] == nums[k+1])k--;

                    result.add(list);

                }else if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }
            }
        }

        return result;
    }
}