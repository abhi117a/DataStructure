package CTC_2;

import java.util.Arrays;

public class findSumCloseToZero {

	public void findSum(int A[]){
//TimeComplexity is O(nlogn) because of QuickSort Java function	
		Arrays.sort(A);
		int positiveContiner = Integer.MAX_VALUE;
		int negativeContainer = Integer.MIN_VALUE;
		int i=0;
		int j = A.length-1;
		
		while(i<j){
			int temp = A[i]+A[j];
			System.out.println(A[i]);
			System.out.println(A[j]);
			System.out.println(temp);
			System.out.println("****************");
			if(temp >=0){
			if(positiveContiner > temp){
				positiveContiner = 0;
				positiveContiner = positiveContiner+temp;
			}
			j--;
			}
			else if(temp <0){
			if(negativeContainer < temp){
				negativeContainer =0;
				negativeContainer = negativeContainer+temp;
			}
			i++;
			}
		}
		if(Math.abs(negativeContainer)- positiveContiner >0){
			System.out.println("Closest sum is "+positiveContiner);
			return;
		}
		else {
			System.out.println("Closest sum is "+negativeContainer );
			return;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		findSumCloseToZero fc = new findSumCloseToZero();
		int a [] = {-4,-99,-1,2,1,-3,5};
		fc.findSum(a);

	}

}
