class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> array = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                array.add(true);
            }else{
                array.add(false);
            }
        }
        
        return array;
        
    }
}