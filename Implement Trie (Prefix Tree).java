class Trie 
{
    class TrieNode
    {
        TrieNode links[];
        boolean isEnd;
        TrieNode()
        {
            links=new TrieNode[26];
        }
        public boolean containsKey(char c)
        {
            return links[c-'a']!=null;
        }
        public TrieNode get(char c)
        {
            return links[c-'a'];
        }
        public void put(char c,TrieNode node)
        {
            links[c-'a']=node;
        }
        public void setEnd()
        {
            isEnd=true;
        }
        public boolean isEnd()
        {
            return isEnd;
        }
    }
    

    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() 
    {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) 
    {
        TrieNode node=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(!node.containsKey(c))
            {
                node.put(c,new TrieNode());
            }
            node=node.get(c);
        }
        node.setEnd();
    }
    
    
    /** Returns if the word is in the trie. */
    public TrieNode prefix(String word)
    {
        TrieNode node=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(node.containsKey(c))
            {
                node=node.get(c);
            }
            else
            {
                return null;
            }
        }
        return node;
    }
    public boolean search(String word)
    {
        TrieNode node=prefix(word);
        return node!=null&&node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) 
    {
        TrieNode node=prefix(prefix);
        return node!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */