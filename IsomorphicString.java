package CTC_2;

import java.util.Arrays;

public class IsomorphicString {
//Time Complexity O(nlogn) due to Sorting step, Space Complexity O(1)
	public void check(String str, String str1){
		char x[] = str.toCharArray();
		char x1[] = str1.toCharArray();
		
	Arrays.sort(x);
	Arrays.sort(x1);
	
	for(int i=0;i<x.length-1;i++){
		if(x[i]==x[i+1]){
			if(x1[i]==x1[i+1]){
				continue;
			}
			else {
				System.out.println("Strings are not Isomorphic");
				return;
			}
		}
		if(x[i]!=x[i+1]){
			if(x1[i]!=x1[i+1]){
				continue;
			}
			else{
				System.out.println("Strings are not Isomorphic");
				return;
			}
		}
	}
		System.out.println("Strings are isomorphic");
		
	}
	
	
	public static void main(String[] args) {
		IsomorphicString is = new IsomorphicString();
		is.check("abc", "dff");

	}

}
