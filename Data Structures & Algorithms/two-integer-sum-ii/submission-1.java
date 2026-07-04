class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j && nums[i]+nums[j]!=target ){
          int x = nums[i]+nums[j];
          if(x>target){
            j--;
          }else{i++;}
        }
        return new int[]{i+1,j+1};
    }
}
