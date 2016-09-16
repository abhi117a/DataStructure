package CTC_2;

import java.util.ArrayList;

public class stringCompression { 

	public void compress(String str){  //Compressing the string using aabbccc = a2b2c3
		char text[] = str.toCharArray(); //converting string to char array
		ArrayList<String> ans = new ArrayList<>();//initializing arraylist of string type as length of new array cannot be determined beforehand.
		int count=0,value=0;
		int i;
		for(i=0 ;i<text.length-1;i++){ //logic for counting the number of characters
			if(text[i]==text[i+1]){
				count++;
			}else{
			ans.add(String.valueOf(text[i]));
			ans.add(Integer.toString(count+1));//adding extra one as the logic skips last character to be included in "count" variable
			count=0;
		}
			
			} //The count for last character is done in if loop but else is not executed thus writing the same logic as of else outside for loop to consider last character also
		ans.add(String.valueOf(text[i]));
		ans.add(Integer.toString(count+1));
		count=0;
		
		if(text.length>=ans.size()){ //Comparing the length of original and newly made array.
			for(String c:ans){
				System.out.print(c);
			}
			}
			else{
				for(Character t:text){
					System.out.print(t);
				}	
			}
		}
	
	public static void main(String[] args) {
		stringCompression sc = new stringCompression();
		sc.compress("aabbcc");

	}

}
