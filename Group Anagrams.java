class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
Map<String , List<String> > map = new  HashMap();
    
        for( String st : strs ){
            char ch[] = st.toCharArray();
            
            Arrays.sort(ch);
            
            String sb = new String(ch);
            
            if( map.containsKey(sb) ){
                map.get(sb).add(st);
            }
            else{
                List<String> l = new ArrayList();
                l.add(st);
                map.put(sb, l);
            }
            
            
        }
        
        List<List<String>> list = new ArrayList();
        
        for( String  sb  : map.keySet() ){
            list.add(map.get(sb));
        }
        return list;
        
    }
}