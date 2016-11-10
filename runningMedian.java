package CTC_2;

import java.util.Arrays;

public class runningMedian {

	public void findMedian(int []A){
		
		int B[] = new int [A.length];
		int cnt = 0;
		for(int k =0; k<B.length;k++){
			B[k] = Integer.MAX_VALUE;
		}
		int counter = 0;
		for(int i=0; i<A.length;i++){
			B[cnt] = A[i];
			counter++;
			cnt++;
			if(counter==1){
				System.out.println(A[i]);
			}
			else if(counter%2==0 && counter!=1){
				Arrays.sort(B);
				int start = counter/2;
				 int end = start +1;
				double median = (double)(B[start-1]+B[end-1])/2;
				System.out.println(median);
				
			}
			else if(counter%2 != 0){
				Arrays.sort(B);
				int median = (int) Math.ceil(counter/2);
				System.out.println(B[median]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		runningMedian rm = new runningMedian();
		int A[] = {12,4,5,3,8,7};
		rm.findMedian(A);

	}

}
