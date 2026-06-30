class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int []ans=new int[2];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
}
