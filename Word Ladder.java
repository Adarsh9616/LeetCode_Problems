class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        HashMap<String,Boolean> m=new HashMap<>();
        for(String s:wordList)
        {
            m.put(s,false);
        }
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        m.put(beginWord,true);
        int length=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                String temp=q.poll();
                if(temp.equals(endWord))
                {
                    return length;
                }
                wordMatch(q,m,temp);
            }
            length++;
        }
        return 0;
    }
    public void wordMatch(Queue<String> q,HashMap<String,Boolean> m,String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ar[]=s.toCharArray();
            for(int j=0;j<26;j++)
            {
                ar[i]=(char)('a'+j);
                String temp=String.valueOf(ar);
                if(m.containsKey(temp)&&m.get(temp)==false)
                {
                    q.add(temp);
                    m.put(temp,true);
                }
            }
        }
    }
}