class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> l = new ArrayList<>();
        String[] original = new String[str.length];
        for(int i=0;i<str.length;i++){
            original[i] = str[i];
        }
        for(int i=0;i<str.length;i++){
            char[] sorted = str[i].toCharArray();
            Arrays.sort(sorted);
            str[i] = String.valueOf(sorted);
        }
        int k = 0;
        for(int i=0;i<str.length;i++){
            List<String> temp = new ArrayList<>();
            if(!str[i].chars().allMatch(Character::isDigit) || str[i].equals("")){
                temp.add(original[i]);    
            }
            for(int j=i+1;j<str.length;j++){
                if(str[j].equals(str[i])){
                    str[j] = Integer.toString(k);
                    k++;
                    temp.add(original[j]);
                }
            }
            str[i] = Integer.toString(k);
            k++;
            if(temp.size() >= 1){
                l.add(temp);
            }
        }
        return l;
        
    }
}