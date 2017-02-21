package CTC_2;

import java.util.Arrays;
import java.util.Hashtable;

public class permutationString {

	public void checkPermute(String str1, String str2){
		if(str1.length()!= str2.length()){
			System.out.println("Not a permutation");
			return;
		}
		char x1[] = str1.toCharArray();
		char x2[] = str2.toCharArray();
		
		Arrays.sort(x1);
		Arrays.sort(x2);
		
		for(int i=0;i<x1.length;i++){
			if(x1[i]!=x2[i]){
				System.out.println("Not a permutation");
				return;
			}
		}
		System.out.println("It's a permutation");
		
		
	}
	
	public void checkPermuteWithHashTable(String str1, String str2){
		if(str1.length()!=str2.length()){
			System.out.println("Not a permutation");
			return;
		}
		char x1[] = str1.toCharArray();
		char x2[] = str2.toCharArray();
		Hashtable<Character,Integer>ht = new Hashtable<Character,Integer>();
		for(int i=0;i<x1.length;i++){
			if(ht.containsKey(x1[i])){
				int j = ht.get(x1[i]);
				ht.put(x1[i], j+1);
			}
			else {
				ht.put(x1[i], 1);
			}
		}
		for(int i=0;i<x2.length;i++){
			if(ht.containsKey(x2[i])){
				int j = ht.get(x2[i]);
				if(j>=0){
					ht.put(x2[i], j-1);
				}
				else {
				System.out.println("Not a permute");
				return;
				}
			}
			else{
			System.out.println("Not a permute");
			return;
			}
		}
		System.out.println("A permutation");
		return;
		
	}
	
	
	
	public static void main(String[] args) {
		permutationString ps = new permutationString();
		//ps.checkPermute("Hi", "gi");
		ps.checkPermuteWithHashTable("Hiiii", "hi");

	}

}
