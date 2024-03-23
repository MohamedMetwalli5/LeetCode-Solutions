class Solution {
    public String decodeMessage(String key, String message) {
     HashMap<Character, Character> h = new HashMap<>(); 
     h.put(' ', ' ');   
     char last = 'a';    
     for(int i=0;i<key.length();i++){
         if(h.get(key.charAt(i)) == null && key.charAt(i) != ' '){
             h.put(key.charAt(i), last);
             last++;
         }
     }
        
     StringBuilder str = new StringBuilder();
     for(int i=0;i<message.length();i++){
        str.append(h.get(message.charAt(i)));
         
     }  
        
     return str.toString();   
        
    }
}