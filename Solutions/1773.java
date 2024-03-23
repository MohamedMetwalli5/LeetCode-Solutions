class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0, count = 0 ;
        if(ruleKey.equals("type")){
            index = 0;
        }else if(ruleKey.equals("color")){
            index = 1;
        }else{
            index = 2;
        }
        for (List list : items){
            if(list.get(index).equals(ruleValue)){ 
                count++;
            }
        }
        return count;
    }
}