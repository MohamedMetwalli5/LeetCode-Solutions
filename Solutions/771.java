class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            h.add(jewels.charAt(i));
        }
        int count = 0;
        for(int i=0;i<stones.length();i++){
            if(h.contains(stones.charAt(i))){
                count++;
            }
        }

        return count;
    }
}