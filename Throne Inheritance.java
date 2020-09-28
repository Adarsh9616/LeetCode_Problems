class ThroneInheritance {

    String name;
    HashMap<String,Queue<String>> pc;
    Set<String> d;
    public ThroneInheritance(String kingName) {
        name=kingName;
        pc=new HashMap<>();
        pc.put(name,new LinkedList<String>());
        d=new HashSet<>();
    }
    
    public void birth(String parentName, String childName) 
    {
        Queue<String> q;
        if(pc.containsKey(parentName))
        {
            q=pc.get(parentName);
            q.add(childName);
            pc.put(parentName,q);
        }
        else
        {
            q=new LinkedList<>();
            q.add(childName);
            pc.put(parentName,q);
        }
    }
    
    public void death(String name) 
    {
        d.add(name);
    }
    
    public List<String> getInheritanceOrder() 
    {
        List<String> ans=new ArrayList<>();
        Queue<String> qq=new LinkedList<>(pc.get(name));
        if(!d.contains(name))
        {
            ans.add(name);
        }
        solve(ans,qq);
        return ans;
    }
    public void solve(List<String>ans,Queue<String> qq)
    {
        if(qq.isEmpty())
        {
            return;
        }
        while(!qq.isEmpty())
        {
            String s=qq.poll();
            if(!d.contains(s))
            {
                ans.add(s);
            }
            if(pc.containsKey(s))
            {
                solve(ans,new LinkedList<>(pc.get(s)));
            }
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */