package solution;

import java.util.Scanner;

public class MaximumPairwiseProduct {

	static long func(long[] data) {
		long maximum1 = 0;
		long maximum2 = 0;
		long maximum = -1;
		int temp =0 ;
		for(int i=0;i<data.length;i++) {
             if(data[i] > maximum) {
            	 maximum = data[i];
            	 temp = i;
             }   
		}
		maximum1 = maximum;
		maximum = -1;
		for(int i=0;i<data.length;i++) {
            if(i!= temp && data[i] > maximum) {
           	 maximum = data[i];
            }   
		}
		maximum2 = maximum;
		return maximum1 * maximum2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		long[] array = new long[n];
		for(int i=0;i<n;i++) {
			array[i] = input.nextLong();
		}
       System.out.println(func(array));
	}

}
