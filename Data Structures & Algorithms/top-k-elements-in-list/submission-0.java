class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> frequencyMap.get(a)-frequencyMap.get(b));

        for(Integer i: frequencyMap.keySet()){
            minHeap.offer(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }


        
        // Build the result array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }
}