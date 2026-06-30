class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<min){
                min=i;
            }
            int profit=i-min;
            ans=Math.max(profit,ans);
             
        }
       
        return ans;
    }
}
