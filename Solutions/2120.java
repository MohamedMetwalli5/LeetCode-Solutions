class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res = new int[s.length()];
        int k = 0;
        for(int i=0;i<s.length();i++){
            int x = startPos[0], y = startPos[1], counter = 0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j) == 'R'){
                    if(y+1 == n){
                        break;
                    }
                    y++;
                }else if(s.charAt(j) == 'L'){
                    if(y-1 == -1){
                        break;
                    }
                    y--;
                }else if(s.charAt(j) == 'U'){
                    if(x-1 == -1){
                        break;
                    }
                    x--;
                }else if(s.charAt(j) == 'D'){
                    if(x+1 == n){
                        break;
                    }
                    x++;
                }
                counter++;
            }
            res[k++] = counter;
        }
        
        return res;
    }
}