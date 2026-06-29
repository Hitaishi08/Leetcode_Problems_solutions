class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        int n = nums1.length , m = nums2.length;
        int i = 0 , j = 0;

        while(i < n && j < m){
            if(nums1[i] < nums2[j])i++;
            else if(nums2[j] < nums1[i])j++;
            else{
                if(list.isEmpty() || list.get(list.size()-1) != nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        
        int[] res = new int[list.size()];

        for(i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}