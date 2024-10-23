class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
            {
                st.push(ch);
            }
            else if(Character.isDigit(ch) && !st.isEmpty())
            {
                st.pop();
            }

        }
        StringBuilder a = new StringBuilder();
        for(char c : st)
        {
            a.append(c);

        }
        
        return a.toString();
    }
}