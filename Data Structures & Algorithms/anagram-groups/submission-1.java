class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String i:strs){
            char [] arr = i.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(i);
        }

        return new ArrayList<>(map.values());
        
    }

    
}
