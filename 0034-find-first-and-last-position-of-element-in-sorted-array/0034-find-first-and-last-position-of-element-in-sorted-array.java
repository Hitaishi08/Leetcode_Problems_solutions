class Solution {
    public int starting(int[] nums,int target){
        int left = 0,right = nums.length - 1;

        int start = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                start = mid;
                right = mid - 1;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return start;

    }
    public int ending(int[] nums,int target){
        int left = 0,right = nums.length - 1;

        int end = -1;
        while(left <= right){
            int mid = (left + right)/2;
            System.out.println(nums[mid]);
            if(nums[mid] == target){
                System.out.println("found1");
                end = mid;
                left = mid + 1;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return end;

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = starting(nums,target);
        ans[1] = ending(nums,target);

        return ans;
    }
 }