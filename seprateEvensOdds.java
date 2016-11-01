package CTC_2;

public class seprateEvensOdds {
//Time Complexity O(n)
	public void seprate(int A[]){
		int left=0,right = A.length-1;
		int out[] = new int[A.length];
		for(int i=0; i<A.length;i++){
			if(A[i]%2==0){
				out[left] = A[i];
				left++;
			}else {
				out[right] = A[i];
				right--;
			}
		}
		for(int k:out){
			System.out.print(" "+k);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seprateEvensOdds se = new seprateEvensOdds();
		int A[] = {1,2,3,4,5,6,7,8,9};
		se.seprate(A);
	}

}
