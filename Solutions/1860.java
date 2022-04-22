class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i = 1;
        while(memory1 >= i || memory2 >= i){
            if(memory1 == memory2 || memory1 >= memory2){
                memory1 -= i;
            }else if(memory2 >= memory1){
                memory2 -= i;
            }
            i++;
        }
        
        int[] arr = new int[3];
        arr[0] = i;
        arr[1] = memory1;
        arr[2] = memory2;
        
        return  arr;
    }
}