class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        int n = fruits.length , m = baskets.length;

        for(int i = 0;i<n;i++){
            boolean placed = false;
            for(int j = 0;j<m;j++){
                if(baskets[j] != -1 && baskets[j] >= fruits[i]){
                    baskets[j] = -1;
                    placed = true;
                    break;
                }
            }
            if(!placed)cnt++;
        }

        return cnt;
    }
}