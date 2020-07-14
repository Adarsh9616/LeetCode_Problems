class Solution {
 List<String> months = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
    
    public String reformatDate(String date) {
        String[] words = date.split(" ");
        
        // fix date
        words[0] = words[0].replaceAll("st", "");
        words[0] = words[0].replaceAll("nd", "");
        words[0] = words[0].replaceAll("rd", "");
        words[0] = words[0].replaceAll("th", "");
        words[0] = String.format("%02d", Integer.parseInt(words[0]));
        
        // fix month
        words[1] = String.format("%02d", months.indexOf(words[1]) + 1);
        
        return words[2] + "-" + words[1] + "-" + words[0];
    }
}