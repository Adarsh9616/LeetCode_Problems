class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens)
        {
            if(isDigit(s))
            {
                stack.push(Integer.parseInt(s));
            }
            else
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push(calc(s,a,b));
            }
        }
        return stack.pop();
        
    }
    public boolean isDigit(String s)
    {
        if(s.equals("+")||s.equals("/")||s.equals("*")||s.equals("-"))
        {
            return false;
        }
        return true;
    }
    public int calc(String op,int a,int b)
    {
        switch(op)
        {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
        }
        return 1;
    }
}