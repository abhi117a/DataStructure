package CTC_2;

import java.util.Arrays;
//If 2 values occur at same number of time it will give as last value as output! Time complexity O(n^2)
public class findNumberofTimes {

	public void find(int A[]){
		int count=0;
		int finCount=0;
		int find = Integer.MIN_VALUE ;
		Arrays.sort(A);
		for(int i=0;i< A.length-1;i++){
			while(A[i]==A[i+1]){
				count++;
				i++;
			}
			if(finCount <= count){
				finCount = count;
				find = A[i];
				count=0;
			}
		}
		finCount = finCount+1;
		System.out.println("Element with highest count is: "+find+" with number of occurence: "+finCount);
	}
	
	
	public static void main(String[] args) {
		findNumberofTimes nt = new findNumberofTimes();
		int a[] = {11,12,8,88,8,8,8,1,1,1,1,1,3,3,3,3,3};
		nt.find(a);

	}

}
