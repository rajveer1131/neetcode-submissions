class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int n=1;

        Arrays.sort(nums);

        for (int i:nums){
            if(n<nums.length){

            if(nums[n]==i){
                return true;
            }
            
            n++;
            }
        }
        return false;
    }
}
