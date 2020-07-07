class Solution 
{
    public String reverseWords(String s) 
    {
       StringBuilder ans = new StringBuilder();
		String[] str = s.split(" ");

		for (String st : str) {
			StringBuilder sb1 = new StringBuilder(st);
			sb1.reverse();
			ans.append(sb1).append(" ");
		}
	
		return ans.toString().trim();
    }
}