class Solution {

    public String encode(List<String> strs) {
        String enString = "";
        if(strs.size()==0)return "empty";
        for(String i:strs){
            
            enString+=i+"-";
        }
        return enString;
    }

    public List<String> decode(String str) {
        List<String> ll = new ArrayList<>();
        if(str.equals("empty"))return ll;
        if(str.length()==0){
            ll.add("");
            
        }else{
        System.out.println(str.substring(0,str.length()-1));
        String[]arr=str.substring(0,str.length()-1).split("-");
            for(String i:arr){
                ll.add(i);
                System.out.println(ll);
            }
        }

        return ll;
    }
}
