class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int sum = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j) == '1'){
                    sum++;
                }
            }
            if(sum > 0){
                l.add(sum);
            }
        }
        
        for(int i=0;i<l.size()-1;i++){
            res += (l.get(i)*l.get(i+1));
        }
        
        return res;
    }
}