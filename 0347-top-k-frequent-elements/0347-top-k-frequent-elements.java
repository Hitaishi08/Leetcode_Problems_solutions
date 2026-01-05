class Solution {
    // simpple approach:
    // 1. store the freqvency in map.
    // 2. put the freq and values in list
    // 3. sort the list
    // 4. store the result in arr and return.
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }

        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr.add(new int[] {entry.getValue(),entry.getKey()});
        }

        arr.sort((a,b) -> b[0] - a[0]);

        int[] ans = new int[k];

        for(int i = 0;i<k;i++){
            ans[i] = arr.get(i)[1];
        }

        return ans;
    }
}