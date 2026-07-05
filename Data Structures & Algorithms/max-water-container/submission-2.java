class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;

        int maxVol = 0;
        while(j>i){
          int base = Math.min(nums[i],nums[j]);
          int vol = base * (j-i);
          System.out.println("Base: " + base +" vol: "+ vol);
          maxVol=Math.max(vol,maxVol);
          
          if(nums[j]>nums[i]){
            i++;
            
          }
          else{
            j--;
          }
          
        }
        return maxVol;
    }
}
