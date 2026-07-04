class Solution {
    public int longestConsecutive(int[] nums) {

      if(nums.length==0)return 0;
        Set<Integer> st = new TreeSet<>();
        for (int i : nums) st.add(i);

        int[] arr = new int[st.size()];
        int z = 0;
        for (int k : st) {
            arr[z] = k;
            z++;
        }

        int cnt = 1;
        int ans = 1;
        for (int i = 1; i < st.size(); i++) {
            if (arr[i] == arr[i - 1] + 1) {
                cnt++;
            } else {
                cnt = 1;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(st);
        return ans;
    }
}
