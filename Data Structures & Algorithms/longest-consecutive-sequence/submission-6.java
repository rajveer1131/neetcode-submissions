class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums) st.add(i);

        int ans = 0;
        for (Integer i : st) {
            if (!st.contains(i - 1)) {
                int cnt = 1;
                int curr = i;
                while (st.contains(curr + 1)) {
                    cnt++;
                    curr = curr + 1;
                    
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
