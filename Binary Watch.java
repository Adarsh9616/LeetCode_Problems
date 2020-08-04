class Solution 
{
    public List<String> readBinaryWatch(int num) 
    {
        if (num < 0 || num > 10) {
            return new ArrayList<>();
        }
        
        List<String> result = new ArrayList<>();
      
        for (int hour = 0; hour <= 11; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
				
				// If number of bits in hour + number of bits in minute equals num
				// add to result or else do nothing.
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == num) {
                    
                    result.add(String.format("%d:%02d", hour, minute));
                    
                }
            }
        }      
        
        return result;
    }
}