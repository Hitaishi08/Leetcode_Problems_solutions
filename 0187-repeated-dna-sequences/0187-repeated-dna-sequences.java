class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        int n = s.length();

        int i = 0,j =0;
        String str = "";
        
        while(j < n){
            str = s.substring(i,j+1);

            if(j - i + 1 < 10)j++;
            else if (j - i + 1 == 10){
                map.put(str,map.getOrDefault(str,0)+1);

                if(map.get(str) == 2){
                    list.add(str);
                }

                i++;
                j++;
            }
        }

        return list;
    }
}