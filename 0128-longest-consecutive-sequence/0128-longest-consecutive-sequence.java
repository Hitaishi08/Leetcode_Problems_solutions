class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int maxlen = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int len = 0;

                while(set.contains(num)){
                    num += 1;
                    len += 1;
                }
                maxlen = Math.max(maxlen,len);
            }
        }

        return maxlen;
    }
}