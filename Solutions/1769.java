class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for(int i=0;i<res.length;i++){
            for(int j=i+1;j<boxes.length();j++){
                if(boxes.charAt(j) == '1'){
                    res[i] += Math.abs(i-j);
                }
            }
            for(int j=i-1;j>=0;j--){
                if(boxes.charAt(j) == '1'){
                    res[i] += Math.abs(i-j);
                }
            }
        }
        
        return res;
    }
}