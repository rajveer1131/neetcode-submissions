class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        Set<Character> st = new HashSet<>();
        int i=0;
        int j=i;
        while(j<s.length()){
           char c = s.charAt(j);
           while(s.substring(i,j).contains(""+c)){
                i++;
           }
           j++;
           len=Math.max(j-i,len);
        }
        return len;
    }
}
