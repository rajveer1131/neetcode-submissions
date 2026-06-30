class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();

        int i=0;
        int j=i;
        int ans =0;
        while(j<s.length()){
            char c= s.charAt(j);
            while(st.contains(c)){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(c);
            j++;
            ans=Math.max(ans,j-i);

        }
        return ans;

    }
}
