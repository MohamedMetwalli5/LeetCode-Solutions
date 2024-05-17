class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        
        //calculate the operations needed from left to right
        int count=0, sum=0;
        for(int i=1;i<n;i++) {
            if(boxes.charAt(i - 1) == '1'){
                count++;
            }
            sum += count;
            res[i] = sum;
        }
        
        //calculate the operations needed from right to left
        count = 0; 
        sum = 0;
        for(int i=n-2;i>=0;i--) {
            if(boxes.charAt(i + 1) == '1'){
                count++;
            }
            sum += count;
            res[i] += sum;
        }
        
        return res;
    }
}
