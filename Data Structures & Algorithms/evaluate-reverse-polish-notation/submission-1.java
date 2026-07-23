class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int left=0;
        for(String s:tokens){
            switch (s){
            case "+":
                String a = st.pop();
                String b = st.pop();
                left = Integer.parseInt(a) + Integer.parseInt(b);
                st.push("" +left);
                break;
            case "-":
                 a = st.pop();
                 b = st.pop();
                left = Integer.parseInt(b) - Integer.parseInt(a);
                st.push("" +left);
                break;
            case "*":
                 a = st.pop();
                 b = st.pop();
                left = Integer.parseInt(a) * Integer.parseInt(b);
                st.push("" +left);
                break;
            case "/":
                 a = st.pop();
                 b = st.pop();
                left = Integer.parseInt(b) / Integer.parseInt(a);
                st.push("" +left);
                break;
            default:
                st.push(s);
                break;
            }
            
        }
        return Integer.parseInt(st.pop());
    }
}
