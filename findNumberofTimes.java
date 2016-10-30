package CTC_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
	
	public void hashFind(int A[]){
//Using HashMap Time Complexity O(n) and Space Complexity O(n)
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int count =0;
		int key =0;
		for(int i=0;i<A.length;i++){
			if(hm.containsKey(A[i])){
				int temp = (Integer)hm.get(A[i]);
				hm.put(A[i],temp+1);
			}
			else {
			hm.put(A[i], 1);	
			}
		}
		 for (Entry<Integer,Integer> entry:hm.entrySet()){
			 System.out.println(entry.getKey()+ "  "+entry.getValue());
			 
			  int val = entry.getValue();
			 if(count < val){
			 count = val;
			 key = entry.getKey();
			 }
		 }
		 System.out.println("Max repetation is "+count+" times and the value is "+key);
	}
	
	
	public static void main(String[] args) {
		findNumberofTimes nt = new findNumberofTimes();
		int a[] = {11, 8, 8, 8, 3, 4, 1, 7};
		nt.find(a);
		nt.hashFind(a);

	}

}
