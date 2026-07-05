class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int maxcount = 0;

        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if(!set.contains(ele-1)){
            int count = 0;
            while(set.contains(ele)){
                set.remove(ele);
                ele += 1;
                count++;
            }
            maxcount = Math.max(maxcount,count);
            }
        }

        return maxcount;
    }
}