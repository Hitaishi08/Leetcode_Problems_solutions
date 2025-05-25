class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int n = entry.getValue();
            count += n * (n - 1) / 2;
        }

        return count;
    }
}