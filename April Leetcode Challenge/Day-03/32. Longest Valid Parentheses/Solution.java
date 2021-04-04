class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        //Take a Stack
        Stack<Integer> st = new Stack<>();
        //Push -1 onto stack
        st.push(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                st.pop();
                //check if the stack is empty
                if(st.empty()){
                    //Then push the current character from the string
                    st.push(i);
                }else{
                    //If the stack is not empty
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
}
