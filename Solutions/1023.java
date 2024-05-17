class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<queries.length;i++) {
           result.add(checkIfFollow(queries[i],pattern));
        }
        return result;       
    }

    public boolean checkIfFollow(String query,String pattern){
        int i=0, j=0;
        while (i < query.length() && j < pattern.length()) {
            if (query.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }else {
                if (Character.isUpperCase(query.charAt(i))) {
                    return false;
                    
                }
                i++;
            }
        }

        return j == pattern.length() && query.substring(i).chars().allMatch(Character::isLowerCase);
    }
    
           
}
