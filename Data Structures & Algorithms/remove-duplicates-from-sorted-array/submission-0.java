class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int k = 1;
        int n=0;
        while (j < nums.length) {
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                
                k++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}