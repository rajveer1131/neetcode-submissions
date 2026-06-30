class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();

        

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
            if(set1.contains(i)){
                set3.add(i);
            }
        }

        int []arr= new int[set3.size()];
        int k=0;
        for(Integer i:set3 ){
            arr[k++]= i;
        }

        return arr;

        
    }
}