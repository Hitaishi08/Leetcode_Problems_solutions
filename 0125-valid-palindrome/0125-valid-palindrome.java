class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != ' ' && Character.isLetterOrDigit(ch)){
                str += ch;
            }
        }

        int i = 0,j= str.length() - 1;

        while(i <= j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if(ch1 != ch2)return false;
            i++;
            j--;
        }

        return true;
    }
}