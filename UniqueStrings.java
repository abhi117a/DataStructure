package CTC_2;

import java.util.Hashtable;

public class UniqueStrings {

	public void checkString(String str){
		char x[] = str.toCharArray();
		int alpha[] = new int [26];
		for(int i=0;i<x.length;i++){
			if(x[i]-97 >=0){
			alpha[x[i]-97]++;
			}
			else{
				alpha[x[i]-65]++;
			}
		}
		for (int i=0;i<alpha.length;i++){
			if(alpha[i]>1){
				System.out.println("Not a unique string");
				return;
			}
		}
		System.out.println("Unique STring");
		return;
	}
	
	public void checkWithHashTables(String str){
		char x[] = str.toCharArray();
		Hashtable<Integer,Character> ht = new Hashtable<Integer, Character>();
		for(int i=0;i<x.length;i++){
			if(ht.containsValue(x[i])){
				System.out.println("Not unique");
				return;
			}
			else {
				ht.put(i, x[i]);
			}
		}
		System.out.println("Unique String");
		return;
	}
	
	
	
	public static void main(String[] args) {
		UniqueStrings us = new UniqueStrings();
		//us.checkString("hHi");
		us.checkWithHashTables("hIi");

	}

}
