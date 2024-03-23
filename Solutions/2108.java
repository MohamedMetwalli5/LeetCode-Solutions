class Solution {
    public String firstPalindrome(String[] words) {
      for(int z=0;z<words.length;z++){
        int i = 0, j = words[z].length()-1;
        while(i <= j) {
            if (words[z].charAt(i) == words[z].charAt(j)) {
                i++;
                j--;
            } else {
                break;
            }
        }
        if(i > j){
            return words[z];
        }
      }  
        
      return "";  
    }
}