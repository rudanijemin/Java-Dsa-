class Solution {
    static boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return true;
            
            if(nums[l]<nums[mid]){
                if(target>=nums[1] && nums[mid]>target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if((nums[mid]<target &&  target<=nums[r])){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,1,1};
        int target = 1;
        System.out.println(search(nums,target));
    }
}
