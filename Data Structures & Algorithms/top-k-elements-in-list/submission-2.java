class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Queue<Integer> q = new PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b)));

        for(int i:map.keySet()){
            q.add(i);
            if(q.size()>k){
                q.poll();
            }
            
        }

        int []ans = new int[k];

        for(int i=0;i<ans.length;i++){
            ans[i]=q.poll();
        }
        return ans;
    }
}
