class Solution {
    public String destCity(List<List<String>> paths) 
    {
        Map<String,String> m=new HashMap<>();
        for(List<String> l:paths)
        {
            m.put(l.get(0),l.get(1));
        }
        String from=paths.get(0).get(0);
        String to=paths.get(0).get(1);
        while(m.containsKey(from))
        {
            to = m.get(from);
            from=to;
        }
        return to;
        
    }
}