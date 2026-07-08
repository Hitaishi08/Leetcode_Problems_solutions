class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            if(i == 0){
                list.add(1);
            }else if(i == 1){
                list.add(1);
                list.add(1);
            }else{
                list.add(1);
                for(int j = 1;j<i;j++){
                    int sum = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    list.add(sum);
                }
                list.add(1);
            }
            res.add(list);
        }
        return res;
    }
}