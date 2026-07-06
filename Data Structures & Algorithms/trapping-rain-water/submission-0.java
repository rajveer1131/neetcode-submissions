class Solution {
    public int trap(int[] nums) {
        
        int l=0;
        int r=nums.length-1;
        int maxL=0;
        int maxR=0;

        int store=0;

        while(l<r){
            if(nums[l]<=nums[r]){
                if(maxL<=nums[l]){
                    maxL=nums[l];
                }else{

                store+=maxL-nums[l];
                }
                l++;
            }else{
                if(maxR<=nums[r]){
                    maxR=nums[r];
                }else{

                store+=maxR-nums[r];
                }
                r--;

            }
        }
        return store;
    }
}
