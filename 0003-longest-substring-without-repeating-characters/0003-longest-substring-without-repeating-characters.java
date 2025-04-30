class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int n = s.length();

        for(int i =0;i<n;i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0) + 1);
        }

        int l = 0, r = 0,maxlen =0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(r < n && l < n){
            char ch = s.charAt(r);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch) > 1 && l < r){
                char ch2 = s.charAt(l);
                map.put(ch2,map.get(ch2)-1);
                l++;
            }

            maxlen = Math.max(r-l+1,maxlen);
            r++;
        }

        return maxlen;
    }
}