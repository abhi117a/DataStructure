package CTC_2;

public class findSubArrayofSumK {
// Finding the length of subarray whose sum is equal to or less than the given input k.
	public void finfSum(int A[], int k){
		int currSum =0;
		int sum =k;
		int start =0;
		int maxLen=0;
		
		
		for(int i=0;i<A.length+1;i++){
			while(currSum > sum){
				currSum  = currSum - A[start++];
			}
			if(currSum <= sum){
				int len = Math.abs(start-i);
				if(maxLen < len){
				maxLen = len;
			}
			}
			if(i < A.length){
				currSum = currSum + A[i];
			}
		}
		System.out.println("Max len is: "+maxLen);
		
	}
	
	public static void main(String[] args) {
		findSubArrayofSumK fs = new findSubArrayofSumK();
		int A[] = {3,1,2,1};
		fs.finfSum(A, 4);

	}

}
