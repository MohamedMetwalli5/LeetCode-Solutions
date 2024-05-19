class MagicDictionary {
    Set<String> originalSet;
    public MagicDictionary() {
        originalSet = new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(String str: dictionary){
            originalSet.add(str);
        }
    }
    
    public boolean search(String searchWord) {
        for(String str: originalSet){
            int count = 0;
            if(searchWord.length() != str.length()){
                continue;
            }
            for(int i=0;i < str.length();i++){
                if(str.charAt(i) != searchWord.charAt(i)){
                    count++;
                }
            }
            if(count == 1){
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
