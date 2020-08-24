class Solution {
    public boolean isValid(String s)
    {
        if (s == null || s.length() == 0)
            return true;
        
        Stack<Character> stack = new Stack<>();
        char[] brackets = s.toCharArray();
        
        for (char bracket : brackets) {
            switch (bracket) {
                case '(' : 
                case '{' :
                case '[' : stack.push(bracket);
                            break;
                case ')' : if (stack.isEmpty() || stack.pop() != '(')
                                return false;
                            break;
                case '}' : if (stack.isEmpty() || stack.pop() != '{')
                                return false;
                            break;
                case ']' : if (stack.isEmpty() || stack.pop() != '[')
                                return false;
                            break;
            }
        }
        
        return stack.isEmpty();
    }
}