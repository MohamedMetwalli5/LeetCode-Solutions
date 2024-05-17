class Solution {
    public int minSteps(String s, String t) {
        int s1[] = new int[26];
        int t1[] = new int[26];
        int res=0;
        for(int i=0;i<s.length();i++){
            s1[s.charAt(i)-'a']++;
            t1[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length;i++){
            res += Math.abs(s1[i]-t1[i]);
        }
        return res/2;
    }
}
