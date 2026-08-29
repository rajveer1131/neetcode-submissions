class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] ans = new int[len];
        int prefix = 1;
        int postfix = 1;

        for(int i=0;i<len;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }

        for(int i=len-1;i>=0;i--){
            ans[i]=postfix*ans[i];
            postfix*=nums[i];
        }

        return ans;
    }
}  
