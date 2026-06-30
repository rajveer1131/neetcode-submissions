class Solution {
    public int longestConsecutive(int[] nums) {
     
        Set<Integer> st = new HashSet<>();
        for(int i:nums)st.add(i);

        int maxLen=0;
        for(int i:st){
            if(!st.contains(i-1)){
                int len=1;
                while(st.contains(i+len)){
                    len++;
                }
                maxLen=Math.max(len,maxLen);
            }
        }
        return maxLen;


    }
}
