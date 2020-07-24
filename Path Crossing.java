class Solution {
    public boolean isPathCrossing(String path) 
    {
        Set<String> s=new HashSet<>();
        int x=0;int y=0;
        String ss=x+"$"+y;
        s.add(ss);
        for(char c:path.toCharArray())
        {
            switch(c)
            {
                case 'N':y++;break;
                case 'S':y--;break;
                case 'E':x++;break;
                case 'W':x--;break;
            }
            ss=x+"$"+y;
            if(s.contains(ss))
            {
                return true;
            }
            s.add(ss);
        }
        return false;
    }
}