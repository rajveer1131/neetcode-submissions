class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        Set<Character> st = new HashSet<>();
        int i=0;
        int j=i;
        while(j<s.length()){
           char c = s.charAt(j);
           while(st.contains(c)){
                st.remove(s.charAt(i));
                i++;
                
                
           }
           st.add(c);

           len=Math.max(j-i+1,len);
           
           j++;
        }
        return len;
    }
}
