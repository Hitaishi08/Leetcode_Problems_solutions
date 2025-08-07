class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int m = p.length();

        int i = 0,j=0;

        List<Integer> list = new ArrayList<>();

        for(int l = 0;l<m;l++){
            map.put(p.charAt(l),map.getOrDefault(p.charAt(l),0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();

        while(j < n){
            char ch = s.charAt(j);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(j - i + 1 < p.length())j++;
            else if(j - i + 1 == p.length()){
                if(map.equals(map2))list.add(i);

                char ch2 = s.charAt(i);
                map2.put(ch2,map2.get(ch2)-1);

                if(map2.get(ch2) == 0)map2.remove(ch2);
                i++;
                j++;
            }

        }

        return list;
    }
}