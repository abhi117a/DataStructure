package CTC_2;

import java.util.HashMap;
import java.util.Map;

public class countOccuranceSortedArray {

	public void bruteForce(int A[], int data){
		//O(n) Works for both sorted and unsorted.
		int count=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==data){
				count++;
			}
		}
		if(count>0){
			System.out.println("Number of occurances is "+count);
		}
		else {
			System.out.println("No occurance is found");
		}
	}
	
	public void binSearch(int A[],int data){
		//Can only work with Sorted array Time Complexity O(logn) provided array is sorted.
		int low=0,high =A.length-1,leftCount=0,rightCount=0,count=0;
	
		if(A[0]==data){ //Adjusting the count as while loop fails to acknowledge the element at 0th position.
			leftCount++;
		}
		while(low <= high){
			int mid = low + (high-low)/2;
			if(A[mid]==data){
				int l = mid;
				int r = mid+1;
				while(A[l]==data && l >0){
					leftCount++;
					l--;
				}
				while(A[r]==data && r < A.length){
					rightCount++;
					r++;
				}
				count = leftCount+rightCount;
				System.out.println("Number of count "+count);
				return;
					}
			else if(data > mid){
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		
	
	}
	
	public void hashCount(int A[],int data){
		//Can be used for sorted as well as unsorted array. Time Complexity O(n), Space O(n). COn an avg faster than bruteForce
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int count =0;
		for(int i=0;i<A.length;i++){
			if(A[i]==data){
			if(hm.containsValue(A[i])){
				count++;
			}
			else {
				hm.put(A[i], 1);
				count++;
			}
			}
		}
		System.out.println("Number of count is "+count);
		
	}
	
	public static void main(String[] args) {
		countOccuranceSortedArray co = new countOccuranceSortedArray();
		int a[] = {1,1,1,2,2,2,2,3,4,5,6};
		co.bruteForce(a, 2);
		co.binSearch(a, 1);
		co.hashCount(a, 2);

	}

}
