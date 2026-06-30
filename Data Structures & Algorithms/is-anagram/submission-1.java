class Solution {
    public boolean isAnagram(String s, String t) {
        int []arr=new int[26];
        int []arr2=new int[26];
        
        
        for(char c:s.toCharArray()){
            arr[c-97]++;
        }
        for(char c:t.toCharArray()){
            arr2[c-97]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i])return false;
        }
        return true;
    }

}
