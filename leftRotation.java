package CTC_2;

public class leftRotation {
//Left Rotation of an array O(n) and Space O(n)
	public void rotate(int A[], int k){
		
		int len = A.length-1;
		int temp [] = new int [k];
		int p=0, m=0;
		for(int i=0;i<temp.length;i++){
			temp[i] = A[i];
		}
		
		for(int j = k;j < A.length;j++){
			A[p] = A[j];
			p++;
		}
		int value = A.length-k;
		for(int l=value; l< A.length;l++){
			A[l] = temp[m];
			m++;
		}
		for(int n: A){
			System.out.println(n);
		}
	
		
		
	}
	
	public static void main(String[] args) {
		leftRotation lr = new leftRotation();
		int A[] = {1,2,3,4,5};
		lr.rotate(A, 2);

	}

}
