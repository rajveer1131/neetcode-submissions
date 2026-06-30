class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int cnt=0;
       int ans=0;

       for(int i:nums){
        if(i==0){
           
            cnt=0;
        }else{

        cnt++;
        }
         ans=Math.max(ans,cnt);
       }

        return ans;
    }
}