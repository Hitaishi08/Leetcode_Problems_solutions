class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int k = 2;

        int i = 0 , j = 0;
        int maxlen = Integer.MIN_VALUE;

        while(j < fruits.length){
            int num = fruits[j];
            map.put(num,map.getOrDefault(num,0)+1);


            while(map.size() > k){
                int num2 = fruits[i];
                map.put(num2,map.get(num2)-1);

                if(map.get(num2) == 0)map.remove(num2);

                i++;
            }

            maxlen = Math.max(maxlen,j - i + 1);
            j++;
        }

        return maxlen;
    }
}