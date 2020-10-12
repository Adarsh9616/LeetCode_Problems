public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<Integer,String>map1=new HashMap<>();
    int count=0;
    public String encode(String longUrl) 
    {
        count++;
        map1.put(count,longUrl);
        return "http://tinyurl.com/"+count;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) 
    {
        int k=shortUrl.lastIndexOf('/');
        int val=Integer.parseInt(shortUrl.substring(k+1));
        return map1.get(val);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));