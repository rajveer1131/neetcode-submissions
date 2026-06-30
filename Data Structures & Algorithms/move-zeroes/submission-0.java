class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        int z=0;
        while(j<nums.length){
            if(nums[j]==0)z++;
            if(nums[j]!=0){

                nums[i]=nums[j];
                i++;
            }
            j++;
        }

        for(int k=nums.length-z;k<nums.length;k++){
            nums[k]=0;
        }

        
    }
}