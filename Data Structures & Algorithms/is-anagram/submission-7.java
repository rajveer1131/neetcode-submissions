class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        
        for(char c:s.toCharArray()){
            arr1[c-97]+=1;
        }

        for(char c:t.toCharArray()){
            arr2[c-97]+=1;
        }

        
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])
            return false;
        }




return true;


    }
}
