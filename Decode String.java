class Solution {
    public String decodeString(String s) 
    {
        Stack<Integer> counts=new Stack<>();
        Stack<String> result=new Stack<>();
        String res="";
        int i=0;
        int l=s.length();
        while(i<l)
        { 
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                    count=count*10+(s.charAt(i)-'0');
                    i+=1;
                }
                counts.push(count);
            }
            else if(c=='[')
            {
                result.push(res);
                res="";
                i+=1;
            }
            else if(c==']')
            {
                StringBuilder temp=new StringBuilder(result.pop());
                int count=counts.pop();
                for(int j=0;j<count;j++)
                {
                    temp.append(res);
                }
                res=temp.toString();
                i+=1;
            }
            else
            {
                res+=c;
                i+=1;
            }
        }
        return res;
    }
}