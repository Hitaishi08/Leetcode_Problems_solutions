class Solution {
    public int solve(int[] nums,int i,ArrayList<Integer> list){
        if(i >= nums.length){
            if(list.isEmpty())return 0;
            else{
                int xor = 0;
                for(int j = 0;j<list.size();j++){
                    xor ^=list.get(j);
                }
                return xor;
            }
        }

        
        list.add(nums[i]);
        int num1 = solve(nums,i+1,list);

        list.remove(list.size()-1);
        int num2 = solve(nums,i+1,list);

        return num1+num2;

    }
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = solve(nums,0,list);
        return ans;
    }
}