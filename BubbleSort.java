package CTC_2;

public class BubbleSort {

	public void bubbleSort(int[]A){
		boolean flag = true;
		int count =0;
		for(int i=A.length-1;i>= 0 ;i--){
			flag = false;
			count++;
			for(int j = 0; j<=i-1;j++){
				if(A[j]>A[j+1]){
					flag = true;
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		if(flag == false){
			System.out.println("Number of Iterations done "+count);
			System.out.println("No more Swaps needed");
			break;
		}
		}
		for(int k=0;k<A.length;k++){
			System.out.print(" "+A[k]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int a [] = {1,2,5,4,3};
		bs.bubbleSort(a);

	}

}
