class Solution {
    public int[][] merge(int[][] arr) {
         List<int[]> ll = new ArrayList<>();
        
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));

        int []current=arr[0];
        ll.add(current);

        // System.out.print(Arrays.toString(arr[0]));
        //         System.out.print(Arrays.toString(arr[1])+"   yo");
        //         System.out.print(Arrays.toString(arr[2])+"   yo");
        for(int i=1;i<arr.length;i++){
          if(current[1]>=arr[i][0]){
            current[1] = Math.max(current[1], arr[i][1]);

          }
          else{
            current=arr[i];
            ll.add(current);
          }
            
        }
        
        
        int[][] ans=new int[ll.size()][2];
        for(int i=0;i<ll.size();i++){
            
                ans[i][0]=ll.get(i)[0];
                ans[i][1]=ll.get(i)[1];
            
        }
        return ans;
    }
}
