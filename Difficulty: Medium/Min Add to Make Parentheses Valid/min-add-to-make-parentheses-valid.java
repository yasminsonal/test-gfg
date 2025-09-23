class Solution {
    public int minParentheses(String s) {
        // code here
        int n=s.length();
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(!st.isEmpty()) st.pop();
                else count++;
            }
        }

    count += st.size();
    return count;
    }
}
