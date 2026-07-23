class Solution {
    public int[] dailyTemperatures(int[] temps) {
        
        int [] result = new int[temps.length];

        // int i=0;
        Stack<Integer> st = new Stack<>();
        // st.push(0);
        for(int j=0;j<temps.length;j++){
            while(!st.isEmpty() && temps[j]>temps[st.peek()]){
                int pIdx = st.pop();
                result[pIdx]= j-pIdx ;
                
            }
            
                st.push(j);
            

        }
        return result;
    }
}
