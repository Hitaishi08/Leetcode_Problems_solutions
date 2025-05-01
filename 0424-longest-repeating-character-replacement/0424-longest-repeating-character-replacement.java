class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0,r = 0,maxlen = 0,maxfreq=0;

        int[] arr = new int[26];

        while(r < n){
            arr[s.charAt(r) - 'A'] += 1;
            maxfreq = Math.max(maxfreq,arr[s.charAt(r) - 'A']);
            while((r - l + 1 - maxfreq) > k){
                arr[s.charAt(l) - 'A'] -= 1;
                l++;
            }
            maxlen = Math.max(maxlen,r - l +1);
            r++;
        }
        return maxlen;
    }
}