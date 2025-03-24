class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i =0;i<nums.length;i++){
            int rem = target - nums[i];
            if(rem==nums[i] && map.get(rem) != i){
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            }
            if(rem!=nums[i] && map.containsKey(rem)){
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            }                             
        }

        return ans;
    }
}