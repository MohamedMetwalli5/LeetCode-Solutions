class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int flag1 = 0, flag2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] > arr2[i]){
                if(flag2 == 1){
                    return false;
                }
                flag1 = 1;
            }else if(arr1[i] < arr2[i]){
                if(flag1 == 1){
                    return false;
                }
                flag2 = 1;
            }
        }
        return true;
    }
}