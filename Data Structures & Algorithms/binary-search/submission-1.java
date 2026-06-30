class Solution {
    public int search(int[] nums, int target) {
        
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(nums[mid]==target){
                
                ans=mid;
                break;
            }
            else if(nums[mid]>target){
                System.out.print(mid);
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
        }
        return ans;
    }
}
