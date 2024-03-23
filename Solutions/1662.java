class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i=0;i<word1.length;i++){
            str1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            str2.append(word2[i]);
        }
        String s1 = str1.toString();
        String s2 = str2.toString();

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}