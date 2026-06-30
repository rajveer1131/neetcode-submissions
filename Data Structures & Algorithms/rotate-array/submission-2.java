class Solution {
    public void rotate(int[] nums, int k) {

        if(k>nums.length){
            k=k%nums.length;
        }

        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
System.out.println(Arrays.toString(nums));
        i=0;
        j=k-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
System.out.println(k);
System.out.println(Arrays.toString(nums));
        i=k;
        j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}