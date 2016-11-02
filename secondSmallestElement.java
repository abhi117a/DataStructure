package CTC_2;

import java.util.Arrays;

public class secondSmallestElement {
//Using Sort Time Complexity O(nlogn)
	public void findSort(int A[]){
		Arrays.sort(A);
		System.out.println("Second smallest element is: "+A[1]);
	}
	public void find(int A[]){
	int small = Integer.MAX_VALUE;
	int small2 = Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++){
		if(A[i]<small){
			small2 = small;
			small = A[i];
		}
		else if(A[i]<small2){
			small2 = A[i];
		}
	}
		System.out.println("Second smalles element is: "+small2);
	}
	
	public static void main(String[] args) {
		secondSmallestElement se = new secondSmallestElement();
		int A[] = {4,6,8,11,3,0};
		se.find(A);

	}

}
