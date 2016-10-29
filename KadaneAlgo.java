package CTC_2;
//Kadane Algorithm which also gives index value range where sum is maximum
public class KadaneAlgo {

	public void MaxSum(int A[]){
		int left =-1,right =-1;
		int tempMaxSum = 0;
		int maxSum = 0;
		for(int i =0;i<A.length;i++){
				if(left == -1){
				left = i;
				}
				tempMaxSum = tempMaxSum+A[i];
				if(tempMaxSum <0){
					left = -1;
					tempMaxSum = 0;
				}
				if(maxSum < tempMaxSum){
					maxSum = tempMaxSum;
					right = i;
				}
		}
		System.out.println("Values from Index "+left+" to "+right+" have Max Sum " + maxSum ); 
		
	}
	
	public static void main(String[] args) {
		KadaneAlgo kl = new KadaneAlgo();
		int [] x = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		kl.MaxSum(x);

	}

}
