class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int n = candies.length;

        for(int i = 0;i<n;i++){
            max = Math.max(max,candies[i]);
        }

        for(int i = 0;i<n;i++){
            if((candies[i] + extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}