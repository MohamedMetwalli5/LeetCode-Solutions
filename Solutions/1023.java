class Solution {
    
    class Trie {
        TrieNode root;
        List<Character> CapitalLetters;
        class TrieNode {
            Map<Character, TrieNode> nodes = new HashMap<>();
        }

        public Trie() { 
            root = new TrieNode(); 
            CapitalLetters = new ArrayList<>();
        }

        public void insert(String pattern) {
            TrieNode current = root;
            char[] PatternCharArray = pattern.toCharArray();
            for(Character c : PatternCharArray) {
                if(Character.isUpperCase(c)){ 
                    CapitalLetters.add(c);
                }
                if(!current.nodes.containsKey(c)){
                    current.nodes.put(c, new TrieNode());
                }
                current = current.nodes.get(c);            
            }
        }

        public boolean search(String query) {
            TrieNode current = root;
            List<Character> CurrentCharactersList = new ArrayList<>(CapitalLetters);
            char[] QueryCharArray = query.toCharArray();
            for(Character c : QueryCharArray) {
                if(!current.nodes.containsKey(c)){
                    if(Character.isUpperCase(c)){ 
                        return false;
                    }else{
                        continue;
                    }
                }
                CurrentCharactersList.remove(c);
                current = current.nodes.get(c);
            }
            return CurrentCharactersList.size() == 0;
        }
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        Trie trie = new Trie();
        trie.insert(pattern);
        List<Boolean> l = new ArrayList<>();
        for(int i=0;i<queries.length;i++){ 
            l.add(trie.search(queries[i]));
        }
        return l;
    }
}
