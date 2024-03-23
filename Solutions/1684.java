class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int[] frequency = new int[26];
    
        for (char c : allowed.toCharArray()){
            frequency[c-'a']++;
        }
    
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (frequency[c-'a'] == 0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    }