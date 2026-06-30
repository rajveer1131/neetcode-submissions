class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i:strs){
            sb.append(i.length()+"#"+i);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> ll = new ArrayList<>();


        for(int i=0;i<str.length();i++){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }
            int strLength = Integer.parseInt(str.substring(i,j));
            j++;

            ll.add(str.substring(j,j+strLength));

            i=j+strLength-1;
        }
        
       
       
        return ll;
    
    }
}
