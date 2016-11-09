package CTC_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public void check(String a, String b){
		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();
		int alphabet[] = new int[26];
		int count=0;
		System.out.println("If u want to implement with unequal lengths of string remove the length checking logic");
		if(a.length()!=b.length()){
			System.out.println("Length did not match");
			return;
		}
		
		for(int i=0;i<a1.length;i++){
			//alphabet[a1[i]-97]++;
			int temp =a1[i]-97;
			alphabet[temp]++;
		}
		
		
		for(int j=0;j<b1.length;j++){
			int temp = b1[j]-97;
			alphabet[temp]--;
		}
		
		for(int i=0;i<alphabet.length;i++){
			count = count+Math.abs(alphabet[i]);
		}
		System.out.println(count);
	
}

	
	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		String a = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
		String b = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
		//System.out.println('b'-97);
		an.check(a, b);

	}

}
