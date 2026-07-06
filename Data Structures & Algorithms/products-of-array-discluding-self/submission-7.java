class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int preFix = 1;
        int postFix = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = preFix;
            preFix *= nums[i];
        }
        System.out.print(Arrays.toString(arr));

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * postFix;
            postFix *= nums[i];
        }
        System.out.print(Arrays.toString(arr));

        return arr;
    }
}
