class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sumTrue=0;
        for(int i:nums){
            sumTrue+=i;
        }
        return sum-sumTrue;

    }
}
