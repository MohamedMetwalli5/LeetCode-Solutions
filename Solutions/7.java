class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        if(x >= 0){
           StringBuilder str = new StringBuilder(s);
           str = str.reverse();
           int result = 0;
           try { 
                result = (int)Integer.parseInt(str.toString());
           } catch (NumberFormatException e) {
                return 0; 
           }
           return result;
       }else{
           String temp = "-"; 
           StringBuilder str = new StringBuilder(s.substring(1));
           str = str.reverse();
           int result = 0;
            try { 
                result = (int)Integer.parseInt(temp + str.toString());
           } catch (NumberFormatException e) {
                return 0; 
           }
           return result;
       }
        
    }
}