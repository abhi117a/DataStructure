package CTC_2;

import java.util.Hashtable;

public class findPairs {

	findPairs(int x [],int k){
		for(int i=0;i<x.length;i++){
			int temp = Math.abs(x[i]-k);
			int temp1 =x[i]+k;
			for(int j = i+1;j<x.length-1;j++){
				if(temp == x[j]){
					System.out.println("{"+x[i]+","+x[j]+"}");
				}
				else if(temp1 == x[j]){
					System.out.println("{"+x[i]+","+x[j]+"}");
				}
			}
		}
	}
	
	 findPairs(int k, int x[] ){
	
		 Hashtable<Integer, Integer> ht = new Hashtable<>();
		 for(int i=0;i<x.length;i++){
			 ht.put(i, x[i]);
			 
		 }
		 for(int i=0;i<x.length;i++){
			 if(ht.containsValue(Math.abs(x[i]-k))){
				 System.out.println(x[i]+","+ht.get(Math.abs(x[i]-k)));
			 }
		 }
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x []={1,2,3,4,5,6,7}; 
		findPairs fp = new findPairs(2, x);
	}

}
