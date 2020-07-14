class Solution 
{
 public int maxNumberOfBalloons(String text) {
        int ans=0;
    char count[]=new char[26];
        for(int i=0;i<text.length();i++){
            count[text.charAt(i)-'a']++;
        }
        String res="balloon";
        while(true){
        for(int i=0;i<res.length();i++){
          if (count[res.charAt(i) - 'a']-- <= 0) 
                return ans;
            
        }
            ans++;
        }
        
    }
}