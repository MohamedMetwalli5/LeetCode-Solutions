public class Codec {

    // Encodes a URL to a shortened URL.
    private HashMap<String, String> h = new HashMap<>();
    private int count = 0;
    
    public String encode(String longUrl) {
        h.put(longUrl, Integer.toString(count));
        this.count++;
        return Integer.toString(count-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        for(String k : h.keySet()){
            if(h.get(k).equals(shortUrl)){
                return k;
            }
        }
        return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));