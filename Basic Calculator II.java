class Solution {
    public int calculate(String s) 
    {
        if (s == null || s.length() == 0) return 0;
        int num = 0, tmp = 0, res = 0;
        char op = '+';
        for (char c : s.toCharArray())
        {
            if (Character.isDigit(c)) 
            {
                tmp = tmp*10 + c - '0';
            }
            else if (c != ' ') 
            {
                //process the numerical value of string so far; based on what 'op' we have before it
                num = cal(num, tmp, op);
                if (c == '+' || c == '-') 
                {
                    res += num;
                    num = 0;
                }
                // reset
                tmp = 0;
                op = c;
            }
        }
        return res + cal(num, tmp, op);
    }
    private int cal(int num, int tmp, char op) 
    {
        if (op == '+') return num + tmp;
        else if (op == '-') return num - tmp;
        else if (op == '*') return num * tmp;
        else    return num / tmp;
    }
}