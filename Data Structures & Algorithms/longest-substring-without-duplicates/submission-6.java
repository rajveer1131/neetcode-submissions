class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len==0)return 0;
        if(len==1)return 1;
        
        int ans = 1;

        Set<Character> st = new HashSet<>();

        int i=0;
        for(int j=0;j<len;j++){
            while(st.contains(s.charAt(j))){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(s.charAt(j));
            ans=Math.max(ans,j-i+1);
        }
        return ans;


    }
}
