class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);

        int[] arr = new int[2];

        for(int i = 1;i<nums.length;i++){
            int rem =  target - nums[i];

            if(map.containsKey(rem)){
                arr[0] = i;
                arr[1] = map.get(rem);
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}