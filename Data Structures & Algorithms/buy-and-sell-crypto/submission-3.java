class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int i=0;
        int j=i+1;
        while(j<nums.length){
            int profit = nums[j]-nums[i];
            max=Math.max(profit,max);

            if(nums[j]<nums[i]){
                i=j;
                j=i+1;
            }
            else{
                j++;
            }
        }
        return max;
    }
}
