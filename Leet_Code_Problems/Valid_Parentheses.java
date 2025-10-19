import java.util.HashMap;
import java.util.Stack;
class Valid_Parentheses {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> st= new Stack<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        int n = s.length();
        for(int i = 0 ; i<n ; i++)
        {
            char ch = s.charAt(i);
            if (map.containsKey(ch))
            {
               st.push(ch);
            }
            else if(map.containsValue(ch))
            {
                if(!st.isEmpty() && map.get(st.peek()) == ch) st.pop();
                
                else return false;
            }
            else return false;
        }
    return st.isEmpty();
    }
    

    public static void main(String args[])
    {
        Valid_Parentheses sol = new Valid_Parentheses();
        String s = "{}[()]";
        sol.isValid(s);
        
    }
}