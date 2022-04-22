class MagicDictionary {

    HashSet<String> h;
    public MagicDictionary() {
        h = new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(int i=0;i<dictionary.length;i++){
            h.add(dictionary[i]);
        }
    }
    
    public boolean search(String searchWord) {
        for(String s : h){
            int count = 0;
            for(int i=0;i<((searchWord.length() > s.length())? s : searchWord).length();i++){
                count += searchWord.charAt(i) != s.charAt(i)? 1:0;
            }
            if(count == 1 && s.length() == searchWord.length()){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */