class Solution {
    
    private static boolean isPrime(int number){
        for(int i=2;i*i<number;i++){
            if(number%i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    
    public int countPrimes(int n) {
        int counter = 0;
        int[] array = new int[n];
        Arrays.fill(array,1);
        
        for(int i=2;i*i<array.length;i++){
          if(array[i] == 1){
               for(int j=i;i*j<array.length;j++){
                   array[i*j] = -1;
               }      
          }   
        }
        
        for(int i=2;i<array.length;i++){
            if(array[i] == 1){
                counter++;
            }
        }
        
        return counter;
        
    }
}