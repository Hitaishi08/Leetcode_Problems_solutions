class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length);

        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
        }

        for(int i = 0;i<nums.length;i++){
            nums[i] = map.get(nums[i]);
        }

        return nums;

    }
}