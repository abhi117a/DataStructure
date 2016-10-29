package CTC_2;

public class BinarySearch {

	public void IterativeSearch(int []A, int data){
		int low =0, high = A.length-1;
		while(low < high){
		int mid = low+(high-low)/2;
		if(A[mid]==data){
			System.out.println("Data found at location: "+mid+" :Index");
			break;
		}
		else if(A[mid]<data) {
		low = mid+1;	
		}
		else {
			high = mid -1;
		}
		}
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int a[] = {1,2,3,4,5};
		bs.IterativeSearch(a, 4);

	}

}
