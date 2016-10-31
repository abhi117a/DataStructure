package CTC_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findSumofKelements {

	public void findSum(int A[],int k){
		boolean flag = true;
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				if(A[i]+A[j]==k){
					flag=false;
					System.out.println("The sum of "+A[i]+" and"+A[j]+" is "+k);
				}
			}
			if(flag==true){
			System.out.println("Summation not found");
		}
		}
	}
	public void hashUsage(int A[],int k){
//Time Complexity O(n)
		int temp=0;
		boolean flag = true;
		//Inserting values into HashMap
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<A.length;i++){
			hm.put(i, A[i]);
		}
		if(hm.containsValue(k)){
		System.out.println("Value "+k+" itself present");
		System.exit(0);
		}
		while(temp<A.length){
			int f = hm.get(temp);
			f = Math.abs(f-k);
			if(hm.containsValue(f)){
				System.out.println("Values are present for summation of "+k);
				flag= false;
				//System.exit(0);
			}
			temp++;
		}if(flag==true){
		System.out.println("Value not found");
		}
	}
	
	public static void main(String[] args) {
		findSumofKelements fs = new findSumofKelements();
		int a []= {1,2,3,7};
		fs.hashUsage(a, 7);
	}

}
