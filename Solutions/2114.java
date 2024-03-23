class Solution {
    public int mostWordsFound(String[] sentences) {
       int max = Integer.MIN_VALUE;
       for(int i=0;i<sentences.length;i++){
           int l = sentences[i].split(" ").length;
           if(l > max){
               max = l;
           }
       } 
       return max; 
    }
}