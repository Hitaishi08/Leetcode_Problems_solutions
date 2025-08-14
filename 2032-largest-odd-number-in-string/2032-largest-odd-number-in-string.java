class Solution {
    public String largestOddNumber(String s) {
        int i = s.length()-1;
        String ans = "";
        while(i >= 0){
            int num = s.charAt(i) - '0';
            if(num % 2 != 0){
                ans = s.substring(0,i+1);
                break;
            }
            i--;
        }

        return ans;
    }
}