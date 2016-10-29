package CTC_2;

import java.util.Arrays;

public class checkIfSameElement {

	public void bruteForce(int A[]){
//Time complexity O(n^2) as 2 for loops are going on.
		boolean flag = true;
		for(int i=0;i<A.length-1;i++){
			for(int j = i+1;j<A.length;j++){
				if(A[i]==A[j]){
					System.out.println("Element found: " +A[i]+" at location: "+ i+" and " + j);
					flag=false;
				}
			}
		}
		if(flag==true){
		System.out.println("Every Element is Unique");
	}
	}
	
	public void sortSearch(int A[]){
//The time complexity will be just O(nlogn) as sorting takes nlogn(Quicksort for inbuilt Java sort) and then just a linear search
		boolean flag = true;
		Arrays.sort(A);
		for(int i=0;i<A.length-1;i++){
			if(A[i]==A[i+1]){
				System.out.println("Element found: " +A[i]+" at location: "+ i+" and " + (i+1));
				flag = false;
			}
		}
		if(flag == true){
		System.out.println("Every Element is unique");
	}
	}
	
	
	public static void main(String[] args) {
		checkIfSameElement cs = new checkIfSameElement();
		int a[] = {1,6,11,7,5,10,11,2};
		cs.bruteForce(a);
		System.out.println("*******************");
		cs.sortSearch(a);

	}

}
