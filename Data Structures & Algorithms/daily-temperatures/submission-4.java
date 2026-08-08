class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[temp.length];

            int j=0;
        for (int i = 0; i < temp.length; i++) {           

                while (!st.isEmpty() && temp[i] > temp[st.peek()] ) {
                    int pIdx =  st.pop();
                    ans[pIdx] = i - pIdx;
                   
                    
                }
            
            st.push(i);
        }
        return ans;
    }
}
