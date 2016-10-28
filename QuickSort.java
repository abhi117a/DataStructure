package CTC_2;

public class QuickSort {
	
	int values[];
	
	public void sort(int A[]){
		this.values = A;
		int size = A.length;
		if(size==0 || size == 1){
			System.out.println("List has 0 or 1 element no Sorting needed");
		}
		else {
			quickSort(0,size-1);
		}
	}
	public void quickSort(int low, int high){
		int i = low;
		int j = high;
		int pivot = values[low+(high-low)/2];
		while(i <=j){
		while(values[i]< pivot){
			i++;
		}
		while(values[j]>pivot){
			j--;
		}
		if(i<=j){
			exchange(i,j);
			i++;
			j--;
		}
		}
		if(i<high){
			quickSort(i,high);
		}
		if(j> low){
			quickSort(low,j);
		}
	}
	public void exchange(int i,int j){
		int temp  = values[i];
		values[i] = values[j];
		values[j] = temp;
	}
	public void show(){
		for(int a: values){
			System.out.println(a+ " ");
		}
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int a[] = {30, 12, 5, 89,55,5};
		qs.sort(a);
		qs.show();
		
		
	}

}
