package CTC_2;

public class MagicIndex {

public void findMagicIndex(int A[], int start, int end){
	//start = 0;
	//end = A.length;
	int mid = (start+end)/2;
	if(A[mid]==mid){
		System.out.println("Magic Index is "+mid);
	}
	else if(A[mid]>mid){
		findMagicIndex(A,start,mid-1);
	}
	else {
		findMagicIndex(A, mid+1, end);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicIndex mi = new MagicIndex();
		int A[] = {-1,0,1,2,4,10};
		mi.findMagicIndex(A, 0, A.length);
		
		
	}

}
