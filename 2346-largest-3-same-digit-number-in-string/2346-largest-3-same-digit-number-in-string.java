class Solution {
    public String largestGoodInteger(String num) {
        int i = 0,j = 0;
        int k = 3;
        int max = -1;
        String ans = "";

        while(j < num.length()){

            if(j - i + 1 < k)j++;
            else if(j - i + 1 == k){
                int n = num.charAt(i) - '0';
                if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                    if(n > max){
                        max = n;
                        ans  = num.substring(i,j+1);
                    }
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}