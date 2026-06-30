class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    sum*=nums[j];
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}  
