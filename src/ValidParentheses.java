public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack();
        int count=0;
        for(int i = 0; i < s.length(); i++) {
            if(isparentheses(s.charAt(i))) {
                st.push(s.charAt(i));
                count++;
            }
            else if(isCloseparentheses(s.charAt(i))) {
                if(!st.empty() && convertCloseToOpen(s.charAt(i)) == st.peek()) {
                    st.pop();
                    count--;
                }
                else return false;
            }
        }
        return st.empty() && count==0;
    }
    public boolean isparentheses(char c) {
        return (c == '(') || (c == '[') || (c == '{');
    }
    public char convertCloseToOpen(char c) {
        switch(c) {
            case ']':
                return '[';
            case ')':
                return '(';
            case '}':
                return '{';
        }
        return 'd';
    }
    public boolean isCloseparentheses(char c) {
        return (c == ')' || c == ']' || c == '}');
    }
}
