class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length()==0)return true;
      return ans(s,t,0,0);
    }

    boolean ans(String s,String t ,int i,int j){
        if(i==s.length())return true;
        if(i<s.length() && j==t.length())return false;

        if(t.charAt(j)==s.charAt(i)){
            return ans(s,t,i+1,j+1);
        }
        return ans(s,t,i,j+1);
    }
}