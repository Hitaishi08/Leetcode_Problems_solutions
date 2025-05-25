class Solution {
    public boolean SecondWay(String s){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        if(s.length() < 26)return false;

        for(int i=0;i<26;i++){
            if(s.indexOf(alpha.charAt(i)) == -1)return false;
        }
        return true;
    }
    public boolean checkIfPangram(String sentence) {
        return SecondWay(sentence);
        // if(sentence.length() < 26)return false;

        // int[] freq = new int[26];

        // for(int i = 0;i<sentence.length();i++){
        //     freq[sentence.charAt(i) - 'a']++;
        // }

        // for(int i = 0;i<26;i++){
        //     if(freq[i] == 0)return false;
        // }

        // return true;
    }
}