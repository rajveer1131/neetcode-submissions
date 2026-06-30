class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<min){
                min=i;
            }
             if(i-min>ans){
                ans=i-min;
            }
        }
       
        return ans;
    }
}
