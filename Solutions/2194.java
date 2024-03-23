class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3); 
        char r1 = s.charAt(1), r2 = s.charAt(4);
        StringBuilder str;
        List<String> l = new ArrayList<>();
        
        for(char i=c1;i<=c2;i++){
            str = new StringBuilder();
            str.append(i);
            for(char j=r1;j<=r2;j++){
                str.append(j);
                l.add(str.toString());
                str = new StringBuilder();
                str.append(i);
            }
        }
        
        return l;
        
    }
}