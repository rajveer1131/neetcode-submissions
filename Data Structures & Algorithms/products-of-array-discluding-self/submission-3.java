class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        

            for (int i = 0; i < nums.length; i++) {
                int n=1;
                for (int j = 0; j < nums.length; j++) {
                    if (j == i)
                        continue;
                        n*=nums[j];
                    
                }
                arr[i]=n;
            } return arr;
    }
}
