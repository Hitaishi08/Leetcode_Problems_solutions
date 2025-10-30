class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] index = new int[2];
        for(int i = 0;i<n;i++){
            int rem = target - nums[i];

            if(map.containsKey(rem)){
                index[0] = map.get(rem);
                index[1] = i;
                break;
            }

            map.put(nums[i],i);
        }
        return index;
    }
}