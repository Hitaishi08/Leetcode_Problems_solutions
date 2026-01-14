class Solution {
    // jha mismatch hua hum usko chhodd kr age ki palindirom check krenge 
    // jaise i skip krke i + 1 to j and j skip krke i to j -1 and if any one is true then yeahhh we got the answer.
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                // to bhaii check kr if (i to j-1) tak palinderom hai?
                // agar hui to true return krde.
                int l = i,r = j-1;
                boolean ispal = false;
                while(l <= r){
                    if(s.charAt(l) == s.charAt(r)){
                        l++;
                        r--;
                        ispal = true;
                    }else{
                        ispal = false;
                        break;
                    }
                }

                if(ispal)return true;

                // nhi to check kr ki (i + 1 to j) tak palindrom hai.
                i = i + 1;
                while(i <= j){
                    if(s.charAt(i) == s.charAt(j)){
                        i++;
                        j--;
                        ispal = true;
                    }else{
                        ispal = false;
                        break;
                    }
                }

                return (ispal) ? true : false;
            }
        }

        return true;
    }
}